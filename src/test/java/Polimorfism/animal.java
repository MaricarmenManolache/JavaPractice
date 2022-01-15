package Polimorfism;

public class animal {
  // polimorfism = conceptul prin care o metoda poate avea implementari diferite
  // 2 feluri= dinamic (override), static (overload)
   // pol dinamic= intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    // poli static= conceptul pe baza caruia o metoda are o structura diferita

    public String rasa;
    public Integer varsta;
    public String nume;

    public animal(String rasa, Integer varsta, String nume) {
        this.rasa = rasa;
        this.varsta = varsta;
        this.nume = nume;
    }

    //polimorfism dinamic
    public void scoateSunet(){
        System.out.println("Animalul scoate sunet");
    }

    public Integer getPret(){
        return 12;
    }
}
