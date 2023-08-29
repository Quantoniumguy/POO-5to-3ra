package miTienda;


public class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
         return super.toString()+ "Nombre: "+this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
