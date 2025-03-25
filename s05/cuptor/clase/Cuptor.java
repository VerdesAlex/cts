package s05.cuptor.clase;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private static Cuptor instance;

    private List<Preparat> listaPreparate;

    private int nrMaximGrade;

    static {
        //preluare date din surse externe
        instance = new Cuptor(270);
    }

    public Cuptor(int nrMaximGrade) {
        this.nrMaximGrade = nrMaximGrade;
        this.listaPreparate = new ArrayList<>();
    }

    public static Cuptor getInstance(){
        return instance;
    }

//    singleton method
    public void addPreparat(Preparat p){
        if(p.getNrGradeGatire() <= this.nrMaximGrade)
            this.listaPreparate.add(p);
    }

    public void afisareInfoCuptor(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cuptor{" +
                "listaPreparate=" + listaPreparate +
                ", nrMaximGrade=" + nrMaximGrade +
                '}';
    }
}
