package S11.SchemeCombinate.program;

import S11.SchemeCombinate.clase.chain.AHandler_filtru;
import S11.SchemeCombinate.clase.chain.FiltruClasament;
import S11.SchemeCombinate.clase.chain.FiltruEseu;
import S11.SchemeCombinate.clase.chain.FiltruNote;
import S11.SchemeCombinate.clase.elemente.Candidat;
import S11.SchemeCombinate.clase.facade.Admitere;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candidat> candidati = List.of(
                new Candidat("Andrei Popescu", "Eseu despre inteligență artificială", 9.45, 8.7), //1
                new Candidat("Maria Ionescu", "Eseu despre leadership", 9.85, 9.1),//2
                new Candidat("Ion Georgescu", "Eseu despre sustenabilitate", 8.90, 7.5),//3
                new Candidat("Elena Marinescu", "Eseu despre educație modernă", 5.3, 9.3),
                new Candidat("Cristian Dinu", "Eseu despre inovație", 8.5, 4.3),
                new Candidat("Ana Dumitru", "Eseu despre etică profesională", 5.5, 4.5)
        );

        Admitere admitere = new Admitere(new FiltruEseu(), new FiltruNote(), new FiltruClasament());

        for(Candidat c: candidati){
            admitere.addCandidat(c);
        }

        admitere.lansareProcesAdmitere();

    }
}
