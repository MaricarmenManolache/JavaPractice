package MostenireIncapsulare;

import org.junit.Test;

import java.util.Arrays;

public class Mosteniretest {
    @Test
    public void TestAutomat(){

        Audi AudiA3= new Audi("hatchback","automata","integrala",4,5, "rosie", Arrays.asList("interior piele",
                "volan incalzit", "incalzire scaun","trapa"),4000, "A3");
        AudiA3.InfoMasina();
        AudiA3.pretfinal();
        System.out.println("--");
        AudiA3.getPret();
        AudiA3.setCuloare("galben");
        AudiA3.InfoMasina();

        Audi A4= new Audi("limuzina","manuala", "integrala", 2,3,"verde", Arrays.asList("volan incalzit", "scaun incaplzit"), 4009, "A4");
        A4.InfoMasina();

        Volkswagen polo=new Volkswagen("limuzina", "automata", "integrala", 4,5,900,"verde", Arrays.asList("scaun incalzit", "volan incalzit"),"polo");
    polo.InfoVolkswagen();
    polo.pretfinal();

        System.out.println(AudiA3.getPret());
AudiA3.setCuloare("galbem");

    }

}
