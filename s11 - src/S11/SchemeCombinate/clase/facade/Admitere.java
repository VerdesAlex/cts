package S11.SchemeCombinate.clase.facade;

import S11.SchemeCombinate.clase.chain.AHandler_filtru;
import S11.SchemeCombinate.clase.chain.FiltruClasament;
import S11.SchemeCombinate.clase.chain.FiltruEseu;
import S11.SchemeCombinate.clase.chain.FiltruNote;
import S11.SchemeCombinate.clase.elemente.Candidat;
import S11.SchemeCombinate.clase.strategy.IStrategy;
import S11.SchemeCombinate.clase.strategy.TehnicaFiltrare;

import java.util.ArrayList;
import java.util.List;

public class Admitere {
    //adaugare responsabikli concreti
    private AHandler_filtru filtru1;
    private AHandler_filtru filtru2;
    private AHandler_filtru filtru3;
    private List<Candidat> candidati;
    private IStrategy strategiaCurenta;

    public void setStrategiaCurenta(IStrategy strategiaCurenta) {
        this.strategiaCurenta = strategiaCurenta;
    }

    public Admitere() {
    }

    public Admitere(AHandler_filtru filtru1, AHandler_filtru filtru2, AHandler_filtru filtru3) {
        this.filtru1 = filtru1;
        this.filtru2 = filtru2;
        this.filtru3 = filtru3;
        this.candidati = new ArrayList<>();
        CreareLant();
    }

    private void CreareLant(){
        //folosind strategia curenta, setez filtrele
        TehnicaFiltrare  tehnicaFiltrare = strategiaCurenta.generareFiltrare();
        filtru1 = tehnicaFiltrare.getFiltru1();
        filtru2 = tehnicaFiltrare.getFiltru2();
        filtru3 = tehnicaFiltrare.getFiltru3();

        this.filtru1.setNextHander(this.filtru2);
        this.filtru2.setNextHander(this.filtru3);
    }

    public void addCandidat(Candidat candidat){
        this.candidati.add(candidat);
    }

    public void lansareProcesAdmitere(){
        System.out.println(this.filtru1.filter(candidati));
    }
}
