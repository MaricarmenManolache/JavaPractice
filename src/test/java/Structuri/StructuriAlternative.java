package Structuri;

import org.junit.Test;

public class StructuriAlternative {
    // doua tipuri de structuri= structuri alternative si repetitive
    // structura alternativa= if conditie then
    //                                     else
    //nu e neaparat nevoie sa facem un ELSE la IF
    //putem avea oricate if uri avem nevoie

    @Test

    public void TestAutomat(){
     verificamnumere();
     VerificaNume("Alexandru", "Alex", "Gheorghe");
     VerificaNumereComplexe(5,-3);
        VerificaNumereComplexe(9,7);
    }
    //verificam daca 5>3
    public void verificamnumere(){
        Integer nr1=5;
        Integer nr2= 5;
        if (nr1>=nr2){
            System.out.println(nr1+" este mai mare sau egal cu "+ nr2);
        }
        else{
            System.out.println(nr1+ " este mai mic decat "+ nr2);
        }
    }
    //verificam daca Alexandru contine Alex
    public void VerificaNume(String nume1, String nume2, String nume3){


        if (nume1.contains(nume3)){
            System.out.println(nume1+ " contine " + nume3);
        }
        else {
            System.out.println(nume1 + " nu contine " + nume3);
        }
        if (nume1.contains(nume2)) {
                System.out.println(nume1 + " contine " + nume2);
            }
        //verificam daca un numar este mai mare ca altul cu mai multe cazuri
    };

    public void VerificaNumereComplexe(Integer nr1,Integer nr2) {
// doi de egal cand nu am definit inainte variabilele
        //parametrii se scriu in paranteza

        if (nr1 > nr2) {
            System.out.println(nr1 + " este mai mare decat " + nr2);
        }
        if (nr1==nr2) {
            System.out.println(nr1 + " este egal cu " + nr2);
        }
        if (nr1 < nr2) {
            System.out.println(nr1 + " este mai micat decat " + nr2);
        }
        if (nr1!=nr2){
            System.out.println(nr1+" este diferit de numarul "+nr2);
        }
    }
}
