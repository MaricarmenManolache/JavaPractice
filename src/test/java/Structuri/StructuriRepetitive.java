package Structuri;

import org.junit.Test;

public class StructuriRepetitive {
    //cele mai intalnite structuri repetitive: for si while

    @Test

    public void TestAutomat(){
        //PrintamNumereFor();
        PrintamNumereWhile();
    }

    //printam primele 200 de numere
    // 1.de la cat prnim
    //2. cat rulam
    // 3. din cat in cat
    public void PrintamNumereFor(){
        for (Integer index=1;index<=200;index++){
            System.out.println(index);
        }
    }

    public void PrintamNumereWhile(){
        Integer index=1;
        while (index<=20){
            System.out.println(index);
            index++;
        }
    }

}
