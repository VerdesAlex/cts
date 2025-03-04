import java.util.Date;

public class Programare {
    private Date data;
    private Medic medic;
    private Pacient pacient;
    private boolean isConsultatie = false;
    private boolean isFinalised = false;
    private String id; //autogen
    private String diagnostic;

    public Programare(Date data, Medic medic, Pacient pacient, String id) {
        this.data = data;
        this.medic = medic;
        this.pacient = pacient;
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Medic getMedic() {
        return medic;
    }

    public void setMedic(Medic medic) {
        this.medic = medic;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isConsultatie() {
        return isConsultatie;
    }

    public void setConsultatie(boolean consultatie) {
        isConsultatie = consultatie;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public void IsConsult(){
        this.isConsultatie = true;
    }

    public void Finalize() {
        this.isFinalised = true;
    }

    public void IncheiereProgramrare(){
        String diagnostic = medic.setDiagnostic(this);
        this.setDiagnostic(diagnostic);
        Finalize();
    }
}
