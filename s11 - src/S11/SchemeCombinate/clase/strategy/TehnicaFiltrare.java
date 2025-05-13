package S11.SchemeCombinate.clase.strategy;

import S11.SchemeCombinate.clase.chain.AHandler_filtru;

public class TehnicaFiltrare {
    private AHandler_filtru filtru1;
    private AHandler_filtru filtru2;
    private AHandler_filtru filtru3;

    public TehnicaFiltrare(AHandler_filtru filtru1, AHandler_filtru filtru2, AHandler_filtru filtru3) {
        this.filtru1 = filtru1;
        this.filtru2 = filtru2;
        this.filtru3 = filtru3;
    }

    public AHandler_filtru getFiltru1() {
        return filtru1;
    }

    public AHandler_filtru getFiltru2() {
        return filtru2;
    }

    public AHandler_filtru getFiltru3() {
        return filtru3;
    }
}
