package Multimi;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    @Test
    public void TestAutomat() {
        MultimiNumereARRAY();
        NumeARRAY();
        MultimiprenumeList();
        multimevaloriHASHMAP();
        multimevaloriHASHMAP2();
        hashmapcuListaTariOrase();
    }

    public void MultimiNumereARRAY() {

        Integer[] Numere = new Integer[3];
        Numere[0] = 5;
        Numere[1] = 6;
        Numere[2] = 7;
        for (Integer index = 0; index < Numere.length; index = index + 1) {
            System.out.println(Numere[index]);
        }
    }

    public void NumeARRAY() {
        String[] Nume = new String[4];
        Nume[0] = "Mari";
        Nume[1] = "Ciprian";
        Nume[2] = "Adelina";
        Nume[3] = "Rodica";
        for (Integer index = 0; index < Nume.length; index = index + 1) {
            System.out.println(Nume[index]);
           
        }
    }

    public void MultimiprenumeList() {

        List<String> prenume = new ArrayList<>();
        prenume.add("Mari");
        prenume.add("Ciprian");
        prenume.add("Adelina");
        prenume.add("Adi");
        for (Integer index = 0; index < prenume.size(); index++) {
            System.out.println(prenume.get(index));
        }

    }

    public void multimevaloriHASHMAP() {
        //hashmap functioneaza dupa logica de key=value
        //mar, morcov si bluza
        HashMap<String, String> Obiectediferite = new HashMap<>();
        Obiectediferite.put("fruct", "mar");
        Obiectediferite.put("leguma", "morcov");
        Obiectediferite.put("haina", "bluza");
        for (String key : Obiectediferite.keySet()) {
            System.out.println("cheia este " + key);
            System.out.println("valoarea unei chei este " + Obiectediferite.get(key));

        }
    }

    public void multimevaloriHASHMAP2() {
        //hashmap functioneaza dupa logica de key=value
        //mar, morcov si bluza
        HashMap<String, Integer> Obiectediferite = new HashMap<String,Integer>();
        Obiectediferite.put("fruct", 2);
        Obiectediferite.put("leguma", 3);
        Obiectediferite.put("haina", 4);
        for (String key : Obiectediferite.keySet()) {
            System.out.println("cheia este " + key);
            System.out.println("valoarea unei chei este " + Obiectediferite.get(key));
        }

        Object firstKey = Obiectediferite.keySet().toArray()[0];
        Object valueForFirstKey = Obiectediferite.get(firstKey);
        System.out.println("prima cheie este " + firstKey.toString());
        System.out.println("prima valoare este " + valueForFirstKey.toString());
    }

    public void hashmapcuListaTariOrase(){
       //1st list
        List<String> oraseromania= new ArrayList<>();
        oraseromania.add("Brasov");
        oraseromania.add("Bucuresti");
        oraseromania.add("Cluj-Napoca");
        oraseromania.add("Bistrita");
       //2nd list
        List<String> orasespania= new ArrayList<>();
        orasespania.add("Barcelona");
        orasespania.add("Valencia");
        orasespania.add("Madrid");
for (Integer index=0 ; index < orasespania.size(); index++){
            System.out.println(orasespania.get(index));
        }

        HashMap <String,List<String>> TariOrase= new HashMap<>();
        TariOrase.put("Romania",oraseromania);
        TariOrase.put("Spanea",orasespania);

        for (String key: TariOrase.keySet()){
            System.out.println("Tara este "+ key);
            System.out.println("Orasele sunt "+TariOrase.get(key));
        }

    }
}