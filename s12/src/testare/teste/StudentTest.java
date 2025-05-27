package testare.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testare.clase.*;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(expected = ExcpetieListaNulla.class)
    public void test1() throws Exception {
        Student s = new Student();
        System.out.println(s.mediaCelorMariNote());
        fail("Lista notelor e nulla!");
    }

    @Test(expected = ExceptieListaNoteGoala.class)
    public void test2() throws Exception {
        Student s = new Student("Ion");
        System.out.println(s.mediaCelorMariNote());
        fail("Lista notelor e goala!");
    }

    @Test(expected = ExceptieNotaNegativa.class)
    public void test3() throws Exception{
        Student s = new Student("Ion");
        s.addNote(-1);
        System.out.println(s.mediaCelorMariNote());
        fail("Nota este nulla!");
    }

    @Test(expected = ExceptieNoteNonDistincte.class)
    public void test4() throws Exception{
        Student s = new Student("Ion");
        s.addNote(10);
        s.addNote(10);
        System.out.println(s.mediaCelorMariNote());
        fail("Nu exista doua note distincte!");
    }
}