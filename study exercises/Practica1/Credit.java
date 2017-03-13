package Practica1;

public abstract class Credit {

    private String numTarjeta;
    private String nombre;
    private String fechaExpiracion;

    public String getNumTarjeta() {
        return this.numTarjeta;
    }

    public void setNumTarjeta(String tarjeta) {
        this.numTarjeta = tarjeta;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaExpiracion() {
        return this.fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public abstract boolean pagar(Integer cantidad) ;
    
}
