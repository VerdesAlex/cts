package s14.teste;

import org.junit.Test;
import s14.clase.Masina;
import s14.exceptii.ExceptieAn;
import s14.exceptii.ExceptieModel;

import static org.testng.AssertJUnit.assertEquals;

public class ConstructorMasinaTest {

    @Test
    public void testRight() throws ExceptieModel, ExceptieAn {
        Masina masina = new Masina("Skodazaur", 99999999999.9,2024);
        assertEquals("Skodazaur", masina.getModel());
        assertEquals(99999999999.9, masina.getPret(), 0.001);
        assertEquals(2024, masina.getAnFabricatie());
    }
}