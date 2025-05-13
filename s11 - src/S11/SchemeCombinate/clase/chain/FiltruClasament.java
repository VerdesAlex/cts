package S11.SchemeCombinate.clase.chain;

import S11.SchemeCombinate.clase.elemente.Candidat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FiltruClasament extends AHandler_filtru {
    private int nrLocuriDisponibile = 5;

    public void setNrLocuriDisponibile(int nrLocuriDisponibile) {
        this.nrLocuriDisponibile = nrLocuriDisponibile;
    }

    @Override
    public List<Candidat> filter(List<Candidat> candidati) {
//        putem lua din surse externe (ex Singleton) nr de locuri oferite
//        putem harcode o valoare (ex100)
//        putem primi ca param info suplim precum nr de locuri in metoda de filtrare

        List<Candidat> candidatiAdmisi = new ArrayList<>();

        if( nrLocuriDisponibile >= candidati.size()) {
            candidatiAdmisi = candidati;
        }
        else{
            candidatiAdmisi = candidati.stream()
                    .sorted(Comparator.comparing(Candidat::getMediaExamen).reversed()).limit(nrLocuriDisponibile)
                    .collect(Collectors.toUnmodifiableList());
        }

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
