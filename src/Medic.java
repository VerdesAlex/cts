import java.util.Scanner;

public class Medic implements Diagnostic {
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public String setDiagnostic(Programare p) {

        if(!p.isConsultatie()){
            throw new RuntimeException("Pacientul nu s-a prezentat la programare!");
        }
        if(p.getMedic().getNume() !=  this.nume){
            throw new RuntimeException("Medicul nu este cel in cauza!");
        }
        else {
            Scanner keyboard = new Scanner(System.in);
            String diagnostic = keyboard.nextLine().toString();;
            return diagnostic;
        }
    }


}
