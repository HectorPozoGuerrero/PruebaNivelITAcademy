package EscapeRoom;

public class SalaTematica {

    public int idSala;
    public String nombreSala;
    public int nivelSala;
    public float valorTotalSala;


    public SalaTematica(float valorTotalSala, int nivelSala, String nombreSala, int idSala) {
        this.valorTotalSala = valorTotalSala;
        this.nivelSala = nivelSala;
        this.nombreSala = nombreSala;
        this.idSala = idSala;
    }


    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public int getNivelSala() {
        return nivelSala;
    }

    public void setNivelSala(int nivelSala) {
        this.nivelSala = nivelSala;
    }

    public float getValorTotalSala() {
        return valorTotalSala;
    }

    public void setValorTotalSala(float valorTotalSala) {
        this.valorTotalSala = valorTotalSala;
    }

    @Override
    public String toString() {
        return "Sala Tematica creada{" +
                "idSala=" + idSala +
                ", nombreSala='" + nombreSala + '\'' +
                ", nivelSala=" + nivelSala +
                ", valorTotalSala=" + valorTotalSala +
                '}';
    }
}
