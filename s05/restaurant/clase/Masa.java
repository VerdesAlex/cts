package s05.restaurant.clase;

import java.io.Serializable;

public class Masa implements Serializable{
    private int id;
    private int nrScaune;
    private boolean esteAfara;
    private boolean estelibera;

    public Masa(int id, int nrScaune, boolean esteAfara, boolean estelibera) {
        this.id = id;
        this.nrScaune = nrScaune;
        this.esteAfara = esteAfara;
        this.estelibera = estelibera;
    }

    public int getId() {
        return id;
    }

    public int getNrScaune() {
        return nrScaune;
    }

    public boolean isEsteAfara() {
        return esteAfara;
    }

    public boolean isEstelibera() {
        return estelibera;
    }

    public void setEstelibera(boolean estelibera) {
        this.estelibera = estelibera;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "id=" + id +
                ", nrScaune=" + nrScaune +
                ", esteAfara=" + esteAfara +
                ", estelibera=" + estelibera +
                '}';
    }
}
