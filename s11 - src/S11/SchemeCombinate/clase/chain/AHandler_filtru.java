package S11.SchemeCombinate.clase.chain;

import S11.SchemeCombinate.clase.elemente.Candidat;

import java.util.List;

public abstract class AHandler_filtru {
    protected AHandler_filtru nextHander;

    public void setNextHander(AHandler_filtru nextHandler){
        this.nextHander = nextHandler;
    }

    public abstract List<Candidat> filter(List<Candidat> candidati);
}
