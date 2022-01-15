package ObiectConstructor;

import org.junit.Test;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import java.sql.SQLOutput;
import java.util.List;

public class Cursant {

    // obiect= instanta unei clase
    // recunoastem un obiect dupa cuv. cheie NEW
    // putem face n obiecte intr-o clasa
    // structura unui obiect (expresie dupa care se recunoaste) un obiect de tipul x (nume clasa= cursant)
    //NumeClasa NumeObiect = new NumeClasa (se va apela constructorul clasei)(dam valori pentru variabile)
    // exemplu obiect de tip cursant
    //Cursant ManolacheMaricarmen= new Cursant()

    //contructor= are ca rol sa initializeze variabilele unei clase ( al cursantului)
    // intr-o clasa putem avea n constructori
    // 2 tipuri de constructori= cu parametri si fara parametri
    //diferentierea intre constructori se face prin tipul/nr parametrilor
    // daca nu fac eu un constructor => exista unul by default fara parametri
    // structura constructor (in mare parte public)= public (nu are un nume) Cursant (preia nume clasa)

    //variabil-nu metoda
    public String nume;
    public String prenume;
    public Integer Varsta;
    public Double Taxa;
    public Character Gen;
    public Boolean Diplomabac;
    public List<String> Cursuriinteres;
    public String CursInteres;

    //initializeaza atributele clasei
    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character gen, Boolean diplomabac, List<String> cursuriinteres) {
        this.nume = nume;
        this.prenume = prenume;
        Varsta = varsta;
        Taxa = taxa;
        Gen = gen;
        Diplomabac = diplomabac;
        Cursuriinteres = cursuriinteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character gen, Boolean diplomabac, List<String> cursuriinteres) {
        this.nume = nume;
        this.prenume = prenume;
        Varsta = varsta;
        Gen = gen;
        Diplomabac = diplomabac;
        Cursuriinteres = cursuriinteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character gen, Boolean diplomabac, String cursInteres) {
        this.nume = nume;
        this.prenume = prenume;
        Varsta = varsta;
        Taxa = taxa;
        Gen = gen;
        Diplomabac = diplomabac;
        CursInteres = cursInteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character gen, Boolean diplomabac, String cursInteres) {
        this.nume = nume;
        this.prenume = prenume;
        Varsta = varsta;
        Gen = gen;
        Diplomabac = diplomabac;
        CursInteres = cursInteres;
    }

    public void dateCursant() {
        System.out.println("Datele despre cursant sunt urmatoarele: ");
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(Varsta);
        if (Taxa!=null){
            System.out.println(Taxa);
        }
        System.out.println(Gen);
        System.out.println(Diplomabac);

        if (Cursuriinteres!= null){
        for (Integer index = 0; index < Cursuriinteres.size(); index++) {
            System.out.println("Cursurile de interes sunt urmatoarele:");
            System.out.println(Cursuriinteres.get(index));
        }
        }
    else{
            System.out.println("Cursul de interes ");
            System.out.println(CursInteres);
        }
    }

    public void  Bac(){

        if (Diplomabac){
            System.out.println("cursantul "+ nume+ " "+ prenume+ " are diploma");
        }
        else {
            System.out.println("cursantul "+prenume + " "+ nume+" nu are diploma");
        }
    }
}