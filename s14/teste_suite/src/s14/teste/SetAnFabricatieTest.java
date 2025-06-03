package s14.teste;

import org.junit.experimental.categories.Category;
import org.junit.rules.Timeout;
import s14.categorii.TestFoarteLent;
import s14.categorii.TestLent;
import s14.categorii.TestRapid;
import s14.clase.Masina;
import s14.exceptii.ExceptieAn;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetAnFabricatieTest {

    private Masina masina;

    @org.junit.Before
    public void setUp() throws Exception {
        masina = new Masina();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Category(TestRapid.class)
    @Test
    public void testRight() throws ExceptieAn {
       masina.setAnFabricatie(2000);
       assertEquals("Nu s-a setat corect anul pentru valoare normala.",2000, masina.getAnFabricatie());
    }

    @Category(TestLent.class)
    @Test
    public void testBoundary1() throws Exception{
        masina.setAnFabricatie(1900);
        assertEquals("Nu s-a setat corect anul pentru valoare limita inferioara.",1900, masina.getAnFabricatie());
    }

    @Category(TestLent.class)
    @Test
    public void testBoundary2() throws ExceptieAn {
        masina.setAnFabricatie(2025);
        assertEquals("Nu s-a setat corect anul pentru valoare limita superioara.",2025, masina.getAnFabricatie());
    }

    @Category(TestRapid.class)
    @Test(expected =  ExceptieAn.class)
    public void testException() throws ExceptieAn{
        masina.setAnFabricatie(1500);
    }

//    @Category(TestRapid.class)
    @Test(timeout = 1)
    public void testPerformance1() throws ExceptieAn{
        for(int i=0;i<10000;i++){
            masina.setAnFabricatie(2000);
        }
    }

    @Category(TestFoarteLent.class)
    @Test
    public void testPerformance2() throws ExceptieAn{
        long start = System.nanoTime();
        for(int i=0;i<100000;i++){
            masina.setAnFabricatie(2000);
        }
        long stop = System.nanoTime();
        System.out.println(start + " - " + stop);
        System.out.println((stop-start)/1000000);
        long prag = 1;
        assertTrue((stop-start)/1000000 <= prag);
    }
}