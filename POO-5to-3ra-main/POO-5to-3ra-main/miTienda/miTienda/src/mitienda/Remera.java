package miTienda;


public class Remera extends Producto {
   private char talle;

    public Remera(char talle, String desc, double precio) {
        super(desc, precio);
        this.talle = talle;
    }
    
    @Override
     public String toString() { 
        return super.toString() + (" Talle: ") + this.talle;
     } 

    public char getTalle() {
        return talle;
    }

    public void setTalle(char talle) {
        this.talle = talle;
    }
    
   @Override
    public double getPrecio(){
        double importe = 0;
        if (this.talle == 'S'){
            importe = this.precio - (this.precio * 5/100);
        }
        if (this.talle == 'M'){
            importe = (this.precio + (this.precio * 5/100));
        }
        if (this.talle == 'L'){
            importe = this.precio + (this.precio * 10/100);
        }
        if (this.talle == 'X'){
            importe = this.precio + (this.precio * 15/100);
        }
        return importe;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
}
