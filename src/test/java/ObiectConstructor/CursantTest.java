package ObiectConstructor;

import org.junit.Test;

import java.util.Arrays;

public class CursantTest {
    @Test

    public void testAutomat(){
        System.out.println("obiect1");
        Cursant ManolacheMaricarmen= new Cursant("Manolache", "Maricarmen", 23, 209.8, 'F',true, Arrays.asList("Automation","Manual","Database"));
        ManolacheMaricarmen.prenume= "Maricarmen-Simona";
        ManolacheMaricarmen.dateCursant();
        ManolacheMaricarmen.Bac();

        System.out.println("-----2------");

        Cursant Mari= new Cursant("Mari","Man", 200, 'M',false, Arrays.asList("Manual", "Auto"));
        Mari.dateCursant();

        System.out.println("---3---");
        Cursant Dorha= new Cursant ("Dorha", "Alex", 27,300.0, 'M', true, "Manual");
        Dorha.dateCursant();

        System.out.println("---4---");
        Cursant Alina= new Cursant("Alina", "Alina", 4, 'M', false, "Manual");
        Alina.dateCursant();
    }
}
