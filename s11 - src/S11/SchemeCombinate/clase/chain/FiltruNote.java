package S11.SchemeCombinate.clase.chain;

import S11.SchemeCombinate.clase.elemente.Candidat;

import java.util.List;

public class FiltruNote extends AHandler_filtru{

    @Override
    public List<Candidat> filter(List<Candidat> candidati) {
//        minim 6 in BAC si min 5 in examen
        List<Candidat> candidatiAdmisi  = candidati.stream().filter(candidat -> candidat.getMediaBAC() >= 6 && candidat.getMediaExamen() >= 5 ).toList();

        System.out.println("Dupa filtrare note au ramas " + candidatiAdmisi.size() + " candidati.");

        if(nextHander != null){
            return nextHander.filter(candidatiAdmisi);
        }
        else {
            System.out.println("S-a terminat filtrarea");
            return candidatiAdmisi;
        }
    }
}
