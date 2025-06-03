package s14.clase;

import s14.exceptii.ExceptieAn;
import s14.exceptii.ExceptieModel;

public class Masina {
    private String model;
    private double pret;
    private int anFabricatie;

    public Masina(String model, double pret, int anFabricatie) throws ExceptieModel, ExceptieAn {
        if(model == null || model.length() <= 2){
            throw new ExceptieModel();
        }
        if(anFabricatie < 1900 || anFabricatie > 2025){
            throw new ExceptieAn();
        }
        this.model = model;
        this.pret = pret;
        this.anFabricatie = anFabricatie;

    }

    public Masina() {
        this.model = "Default";
        this.pret = 20000;
        this.anFabricatie = 1900;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) throws ExceptieAn {
        if(anFabricatie < 1900 || anFabricatie > 2025){
            throw new ExceptieAn();
        }
        else {
            this.anFabricatie = anFabricatie;
        }
    }
}
