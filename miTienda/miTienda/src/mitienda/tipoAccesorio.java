package miTienda;

public enum tipoAccesorio {
    COLLAR("Collar"),
    ANILLO("Anillo"),
    ARITO("Arito");

    private String descripcion;

    private tipoAccesorio(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
