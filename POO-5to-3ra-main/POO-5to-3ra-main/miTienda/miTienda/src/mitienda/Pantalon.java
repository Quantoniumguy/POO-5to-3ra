package miTienda;


public class Pantalon extends Producto{
    private String talle;
    // TALLE ES DE TIPO INT

    public Pantalon(String talle, String desc, double precio) {
        super(desc, precio);
        this.talle = talle;
        // FALTA  MODELO
    }
    
    @Override
    public String toString() {
  
       return super.toString() + (" Talle: ") + this.talle ;
    }
    
    @Override
    public double getPrecio() {
        // COMPARAR CON MODELO
        if (this.talle.equalsIgnoreCase("Oxford")) {
            this.precio = this.precio + (this.precio * 0.15);
        }
        if (this.talle.equalsIgnoreCase("Skinny")) {
            this.precio = this.precio + (this.precio * 0.20);
        }
        if (this.talle.equalsIgnoreCase("Recto")) {
            this.precio = this.precio - (this.precio * 0.15);
        }
        return precio;
}

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
    
    
    
    
}
