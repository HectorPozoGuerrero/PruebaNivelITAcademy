package EscapeRoom;

public class Inventario {

    public int idInventario;
    public String nombre;
    public float precioSinImpuesto;


    public Inventario(int idInventario, String nombre, float precioSinImpuesto) {
        this.idInventario = idInventario;
        this.nombre = nombre;
        this.precioSinImpuesto = precioSinImpuesto;
    }


    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioSinImpuesto() {
        return precioSinImpuesto;
    }

    public void setPrecioSinImpuesto(float precioSinImpuesto) {
        this.precioSinImpuesto = precioSinImpuesto;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "idInventario=" + idInventario +
                ", nombre='" + nombre + '\'' +
                ", precioSinImpuesto=" + precioSinImpuesto +
                '}';
    }
}
