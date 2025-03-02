import java.util.*;

public class hihiha {
    private int[] punctaje;
    private int valid = 0;

    public hihiha(int[] punctaje) {
        this.punctaje = punctaje;
    }

    public int[] getPunctaje() {
        return punctaje;
    }

    public void setPunctaje(int[] punctaje) {
        this.punctaje = punctaje;
    }

    public int getPozitie(int pct) throws Exception {

        validari();

        if( valid == 0){
            return 0;
        }

        List<Integer> l1 = new ArrayList<Integer>();
        for(int elm : punctaje){
            if(!(l1.contains(elm))){
                l1.add(elm);
            }
        }
        Collections.sort(l1, Collections.reverseOrder());
        return l1.indexOf(pct)+1;
    }

    private void validari () throws Exception {
        if(punctaje.length == 0 || punctaje == null){
            throw new voidVector("Vectorul de valori este null");
        }
        if(punctaje.getClass() != int[].class){
            throw new InvalidTypeException("Invalid value in vector");
        }
        else{
            for(int i = 0; i < punctaje.length; i++){
                if(punctaje[i] < 0){
                    throw  new NegativeNumberException("Negative scores not allowed");
                }
            }
        }
        valid = 1;
    }
}
