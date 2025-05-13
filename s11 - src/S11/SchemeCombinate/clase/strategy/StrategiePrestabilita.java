package S11.SchemeCombinate.clase.strategy;

import S11.SchemeCombinate.clase.chain.FiltruClasament;
import S11.SchemeCombinate.clase.chain.FiltruEseu;
import S11.SchemeCombinate.clase.chain.FiltruNote;

public class StrategiePrestabilita implements IStrategy {
    @Override
    public TehnicaFiltrare generareFiltrare() {
        return new TehnicaFiltrare(new FiltruEseu(), new FiltruNote(), new FiltruClasament());
    }
}
