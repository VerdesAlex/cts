package S11.SchemeCombinate.clase.strategy;

public class StrategieCustomizabila implements IStrategy {
    @Override
    public TehnicaFiltrare generareFiltrare() {
        return null; // aici merge sa se citeasca de la tastatura niste stringuri d tip eseu, note, clasament si sa se construiasca filtrele
        //si clientu decide ordinea de admitere
    }
}
