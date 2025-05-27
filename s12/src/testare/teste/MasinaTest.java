package testare.teste;

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import testare.clase.ExceptieNrKm;
import testare.clase.Masina;

import static org.junit.jupiter.api.Assertions.*;

public class MasinaTest {

    @org.junit.Before
    public void setUp() {
        System.out.println("Set up");
    }

    @org.junit.After
    public void tearDown() {
        System.out.println("Tear down");
    }

    @Test
    public void test1() throws ExceptieNrKm {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        m.setNrKm(300);
    }

    @Test(expected = ExceptieNrKm.class)
    public void test2() throws ExceptieNrKm {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        m.setNrKm(-300);
    }

    @Test
    public void test3() throws ExceptieNrKm {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        m.setNrKm(300);
        assertEquals(300,m.getNrKm(),"Verif cu nr km normal");
    }

    @Test
    public void test4() throws ExceptieNrKm {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        m.setNrKm(-300);
        assertEquals(200,m.getNrKm(),"Verif cu nr km negativ");
    }
    @Test
    public void test5(){
        Masina m = new Masina("Opel", 12000, 200, 2015);
        try {
            m.setNrKm(-300);
            //1 NU e bn
            fail("nu arunca exceptie chiar daca am trimis nr km negativi");
        }
        catch (ExceptieNrKm e){
            throw new RuntimeException(e);
            //2 e bn
            //assertTrue(true);
        }
        assertEquals(200,m.getNrKm(),"S-a modificat nr km pe apeli set cu nr km negativi");
    }
}