package s14.mock;

import s14.clase.AbstractMasina;
import s14.clase.AbstractVreme;

public class VremeMock implements AbstractVreme {
    private boolean estePloaie;
    private int cantitatePloaie;

    public VremeMock(boolean estePloaie, int cantitatePloaie) {
        this.estePloaie = estePloaie;
        this.cantitatePloaie = cantitatePloaie;
    }

    @Override
    public boolean estePloaie() {
        return this.estePloaie;
    }

    @Override
    public int getCantitatePrecipitatii() {
        return this.cantitatePloaie;
    }
}
