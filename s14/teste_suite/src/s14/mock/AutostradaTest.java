package s14.mock;

import org.junit.Test;
import s14.clase.AbstractMasina;
import s14.clase.AbstractVreme;
import s14.clase.Autostrada;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AutostradaTest {

    @Test
    public void testRight(){
        List<AbstractMasina> lista = new ArrayList<AbstractMasina>();
        lista.add(new MasinaMock(130));
        lista.add(new MasinaMock(90));
        lista.add(new MasinaMock(70));
        lista.add(new MasinaMock(50));
        lista.add(new MasinaMock(290));
        lista.add(new MasinaMock(300));
        AbstractVreme vreme = new VremeMock(true, 0);
        int rezultat = Autostrada.getNrAmenzi(lista,vreme);
        assertEquals(3, rezultat);
    }

}