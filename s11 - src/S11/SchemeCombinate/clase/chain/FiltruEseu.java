package S11.SchemeCombinate.clase.chain;

import S11.SchemeCombinate.clase.elemente.Candidat;

import java.util.List;

public class FiltruEseu extends AHandler_filtru{

    @Override
    public List<Candidat> filter(List<Candidat> candidati) {
//        eseu corect = lungime impara
        List<Candidat> candidatiAdmisi  = candidati.stream().filter(candidat -> candidat.getEseu().length() % 2 == 1).toList();

        System.out.println("Dupa filtrare eseu au ramas " + candidatiAdmisi.size() + " candidati.");

        if(nextHander != null){
            return nextHander.filter(candidatiAdmisi);
        }
        else {
            System.out.println("S-a terminat filtrarea");
            return candidatiAdmisi;
        }
    }
}
