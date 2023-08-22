package miTienda;

import java.time.LocalDate;
import java.util.ArrayList;


public class Venta {
    private ArrayList<Producto> listaProducto;
    private Cliente cliente;
    private static int cantVentas = 1090;
    private int nroFact;
    private LocalDate fecha;

    public Venta(ArrayList<Producto> listaProducto, Cliente cliente) {
        this.listaProducto = listaProducto;
        this.cliente = cliente;
        this.nroFact = cantVentas++;
        this.fecha = LocalDate.now();
    }

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static int getCantVentas() {
        return cantVentas;
    }

    public static void setCantVentas(int cantVentas) {
        Venta.cantVentas = cantVentas;
    }

    public int getNroFact() {
        return nroFact;
    }

    public void setNroFact(int nroFact) {
        this.nroFact = nroFact;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    public void agregarProducto(Producto p){
        nroFact++;
        this.listaProducto.add(p);
        cantVentas++;
        
        
       
    }
    
    public double calcularImporteTotal(){
        double total = 0.0;
        for (Producto a : listaProducto){
            total += a.getPrecio();
        }
    
        return total;
    
    }
    
    public void imprimirFactura() {
    System.out.println("Factura N°: " + nroFact + " - " + fecha);
    for (Producto p : listaProducto) {
        System.out.println(p.toString());
    }
    System.out.println("Total a pagar: ........ $ " + calcularImporteTotal());
    System.out.println();
    }


}
