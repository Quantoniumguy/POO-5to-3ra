package miTienda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Venta> caja = new ArrayList<>();
        String talle;
        String Accesorio;
        String Metal;
        Double Peso;
        
        char continuar;
        Cliente cliente; 
        do {
            // Solicitar datos del cliente y productos
            System.out.println("Ingrese el nombre del cliente:");
            String nombreCliente = scanner.nextLine();
             cliente = new Cliente(nombreCliente);
            
            // Crear una lista para almacenar los productos de la venta actual
            ArrayList<Producto> listaProducto = new ArrayList<>();
            
            System.out.println("Que producto quiere? (Remera, Pantalon, Accesorio)");
            String descripcion = scanner.nextLine();
            
            if(descripcion.equals("Remera")){
                System.out.println("Que talle?: S, M, L, X");
                talle = scanner.next();
                Producto r = new Remera(talle.charAt(0), descripcion, 3000); 
                listaProducto.add(r);
            }
            if(descripcion.equals("Pantalon")){
            System.out.println("Que pantalon?: Skinny, Oxford, Recto");
            talle = scanner.next();
            Producto p = new Pantalon(talle, descripcion, 6000);
            listaProducto.add(p);
            }
            if(descripcion.equals("Accesorio")){
                System.out.println("Que accesrio quisiera?: Collar, Anillo, Arito");
                Accesorio  = scanner.next();
                System.out.println("Que metal?: Oro, Plata, Acero");
                Metal = scanner.next();
                System.out.println("Cuantos gramos pesa?: ");
                Peso = scanner.nextDouble();
                Producto c = new Accesorio(Peso, tipoAccesorio.valueOf(Accesorio.toUpperCase()), descripcion, 6000);
                listaProducto.add(c);
            }
            // Lógica similar para Pantalon y Accesorio
            
            // Crear una venta con los productos y el cliente
            Venta venta = new Venta(listaProducto, cliente);
            caja.add(venta); // Agregar la venta a la caja
            
            System.out.println("¿Desea hacer otra venta? (S/N):");
            continuar = scanner.next().charAt(0);
            scanner.nextLine(); // Limpiar el buffer de entrada
        } while (continuar == 'S' || continuar == 's');
        
        // Mostrar los detalles de la caja
        System.out.println("Detalles de la caja:");
        double recaudacionTotal = 0.0;
        System.out.println("Cliente: " + cliente.getNombre());
        for (Venta venta : caja) {
            venta.imprimirFactura();
            recaudacionTotal += venta.calcularImporteTotal();
        }
        System.out.println("Cantidad de ventas realizadas: " + caja.size());
        System.out.println("Recaudación total: $" + recaudacionTotal);
    }
}
