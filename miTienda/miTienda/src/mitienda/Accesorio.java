package miTienda;


public class Accesorio extends Producto{
    private double peso;
    private String metal;

    public Accesorio(double peso, String metal, String desc, double precio) {
        super(desc, precio);
        this.peso = peso;
        this.metal = metal;
    }
    
    @Override
    public String toString() {
  
       return super.toString() + (" Gramos: ") + this.peso + (" Metal: ") + this.metal ;
    }
    
    @Override
    public double getPrecio() {
        if (this.metal.equals("Oro")){
            this.precio = this.peso * 17000;
        }
        if (this.metal.equals("Plata")){
            this.precio = this.peso * 448;
        }
        if (this.metal.equals("Acero")){
            this.precio = this.peso * 2000;
        }
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
