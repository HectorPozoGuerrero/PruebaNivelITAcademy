package EscapeRoom;

public class Objeto extends Inventario{

    public int idSalaTematica;
    public String tipoMaterial;


    public Objeto(int idInventario, String nombre, float precioSinImpuesto, int idSalaTematica, String tipoMaterial) {
        super(idInventario, nombre, precioSinImpuesto);
        this.idSalaTematica = idSalaTematica;
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "tipoMaterial='" + tipoMaterial + '\'' +
                ", idSalaTematica=" + idSalaTematica +
                ", precioSinImpuesto=" + precioSinImpuesto +
                ", nombre='" + nombre + '\'' +
                ", idInventario=" + idInventario +
                '}';
    }
}
