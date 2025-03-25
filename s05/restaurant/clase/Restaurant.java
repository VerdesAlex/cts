package s05.restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static Restaurant instance = new Restaurant();

    //singleton data
    List<Masa> listMese;
    private String denumire;

    private Restaurant(){
        listMese = new ArrayList<>();
    }

    public static Restaurant getInstance() {
        return instance;
    }

    //singleton methods+operations
    public void addMasa(Masa m){
            this.listMese.add(m);
    }

    public Masa getMasaLibera(int nrPersoane, boolean afara){
        for(Masa m:listMese){
            if(m.getNrScaune() >= nrPersoane && m.isEstelibera() && m.isEsteAfara() == afara){
                return m;
            }
        }
        return null;
    }
}
