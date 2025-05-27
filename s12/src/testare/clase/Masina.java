package testare.clase;

public class Masina {
    private String model;
    private double pret;
    private int nrKm;
    private int anFabricatie;

    public Masina(String model, double pret, int nrKm, int anFabricatie) {
        this.model = model;
        this.pret = pret;
        this.nrKm = nrKm;
        this.anFabricatie = anFabricatie;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getNrKm() {
        return nrKm;
    }

    public void setNrKm(int nrKm) throws ExceptieNrKm {
        if(nrKm < 0 ) {
            //this.nrKm=nrKm;
//            if(this.nrKm < 0 )
//                this.nrKm = this.nrKm * (-1);
            throw new ExceptieNrKm();
        }
        else {
            this.nrKm = nrKm;
        }
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }






    @Override
    public String toString() {
        return "Masina{" +
                "model='" + model + '\'' +
                ", pret=" + pret +
                ", nrKm=" + nrKm +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
