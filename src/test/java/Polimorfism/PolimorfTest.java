package Polimorfism;

import org.junit.Test;

public class PolimorfTest {

    @Test
    public void TestAutomat(){
     Caine Labrador= new Caine("labrador", 2,"Gina");
     Labrador.scoateSunet();
     Labrador.apeleazaMetodaParinte();
     Labrador.cumparaProduse(" pedigree");
     Labrador.cumparaProduse(1);
     Labrador.nume= "cici";
        System.out.println(Labrador.nume+ " "+ Labrador.rasa+ " "+ Labrador.varsta);
    }
}
