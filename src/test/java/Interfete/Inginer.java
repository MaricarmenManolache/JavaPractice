package Interfete;

public interface Inginer {
    //abstractizare= conceptul prin car edefinim comportamentul unei clase
    // ce trebuie a contina
    //specificam ca toate metodele dintr-o interft sunt abstracte= nu au implementare
    // interfata nu are constructor => nu poti face un obiect
    // interfata se implementeaza
    // clasa care implementeaza interfata= implementeaza toate metodele interfetei
    // o clasa poate implementa mai multe interfete
    // on interfata poate mosteni o alta interfata
    // nu are nevoie de acolade
    // sunt publice

    void Proiecteaza();
    void Executa();
}
