package s05.cuptor.program;

import s05.cuptor.clase.Cuptor;
import s05.cuptor.clase.Preparat;

public class Main {
//    unic cuptor la nivel de restaurant
//    bucatarii asteapta la coada sa bage prep in cuptor
//    lista de asteptare la nivel de cuptor (lista de preparate -> nume, grade pt gatire, nr minute)

    public static void main(String[] args) {
        Cuptor.getInstance().addPreparat(new Preparat("friptura",230,5));
        Cuptor.getInstance().addPreparat(new Preparat("tarta",180,20));
        Cuptor.getInstance().addPreparat(new Preparat("paine",280,50));


        Cuptor.getInstance().afisareInfoCuptor();
    }


}
