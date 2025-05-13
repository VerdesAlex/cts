package S11.SchemeCombinate.clase.elemente;

public class Candidat {
    private String nume;
    private String eseu;
    private Double mediaBAC;
    private Double mediaExamen;

    public Candidat() {
    }

    public Candidat(String nume, String eseu, Double mediaBAC, Double mediaExamen) {
        this.nume = nume;
        this.eseu = eseu;
        this.mediaBAC = mediaBAC;
        this.mediaExamen = mediaExamen;
    }

    public String getNume() {
        return nume;
    }

    public Double getMediaBAC() {
        return mediaBAC;
    }

    public Double getMediaExamen() {
        return mediaExamen;
    }

    public String getEseu() {
        return eseu;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "nume='" + nume + '\'' +
                ", eseu='" + eseu + '\'' +
                ", mediaBAC=" + mediaBAC +
                ", mediaExamen=" + mediaExamen +
                '}';
    }


}
