package testare.clase;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;
import static java.util.Collections.swap;

public class Student {
    private List<Double> lista_note;
    private String nume;

    public Student(List<Double> lista_note) {
        this.lista_note = new ArrayList<>();
        this.lista_note = lista_note;
    }

    public Student() {
        //this.lista_note = new ArrayList<>();
    }

    public Student(String nume) {
        this.lista_note = new ArrayList<>();
        this.nume = nume;
    }

    public List<Double> getLista_note() {
        return lista_note;
    }

    public void setLista_note(List<Double> lista_note) {
        this.lista_note = lista_note;
    }

    public void addNote(double nota) throws ExceptieNotaNegativa {
        this.lista_note = new ArrayList<>();
        if(nota < 0){
            throw new ExceptieNotaNegativa();
        }
        else {
            this.lista_note.add(nota);
        }
    }

    public double mediaCelorMariNote() throws Exception {
        if(this.lista_note == null){
            throw new ExcpetieListaNulla();
        }
        if(this.lista_note.size() == 0){
            throw new ExceptieListaNoteGoala();
        }
        else {
            double n1=-1,n2=-1;
            for(double nota:this.lista_note){
                if(nota > n1){
                    n1=nota;
                }
                else if(nota > n2 && nota != n1){
                    n2 = nota;
                }
            }

            if(n2 == -1){
                throw new ExceptieNoteNonDistincte();
            }

            return (n1+n2)/2;
        }

    }
}
