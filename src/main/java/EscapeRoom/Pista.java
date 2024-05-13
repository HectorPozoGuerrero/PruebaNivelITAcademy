package EscapeRoom;

public class Pista extends Inventario {

    public int idSalaTematica;
    public float tiempoEstimado;

    public Pista(int idInventario, String nombre, float precioSinImpuesto, int idSalaTematica, float tiempoEstimado) {
        super(idInventario, nombre, precioSinImpuesto);
        this.idSalaTematica = idSalaTematica;
        this.tiempoEstimado = tiempoEstimado;
    }

    public double calcularIVA(){
        return precioSinImpuesto*0.21;
    };

    @Override
    public String toString() {
        return "Pista: " + nombre +
                "\nidInventario: " + idInventario +
                "\nPrecio: " + calcularIVA() + "€/IVA incluydo" +
                "\nIdSalaTematica: " + idSalaTematica +
                "\nTiempo estimado: " + tiempoEstimado;
    }
}
