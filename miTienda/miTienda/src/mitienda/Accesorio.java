package miTienda;

public class Accesorio extends Producto implements Importable {
    private double peso;
    private tipoAccesorio tipo;

    public Accesorio(double peso, tipoAccesorio tipo, String desc, double precio) {
        super(desc, precio);
        this.peso = peso;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo: " + tipo.getDescripcion() + ", Peso: " + peso;
    }
    
    
   @Override
    public double getPrecio() {
        double importe = 0;
    // Calcular el precio según el tipo de accesorio
        switch (tipo) {
            case COLLAR:
                importe = peso * 17000; // Precio para Collar
                break;
            case ANILLO:
                importe = peso * 448; // Precio para Anillo
                break;
            case ARITO:
                importe = peso * 2000; // Precio para Arito
                break;
    }
    
    return importe;
}

    @Override
    public double calcularArancelAduanero() {
        double precioSinIva = precio; // Suponiendo IVA del 21%
        return precioSinIva * 0.10; // 10% sobre el precio sin IVA
    }
    
    @Override
    public double calcularArancelTransporte() {
        double precioSinIva = precio; // Suponiendo IVA del 21%
        return precioSinIva * 0.02; // 2% sobre el precio sin IVA
    }
    
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    


}
