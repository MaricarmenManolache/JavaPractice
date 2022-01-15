package ClasaAbstracta;

public abstract class PersoanaAbstract {
    // clasa abstracta=pot sau nu sa contina metode abstracte
    //clasa care extinde o clasa abstracta= implementeaza toate metodele abstracte, daca nu, trebuie declarata ca fiind abstracta
    //diferenta fata de interfata e faptul ca clasa abstracta poate sa contina un constructor, nu putem ddeclara un obiect
    //metodele abstracte fol cuv abstract
    //o clasa abstracta poate implementa o interfata
    //o interfata nu poate extinde o cls abstr.
    // metodele pot fi public, trebuie
   public abstract void Proiecteaza();
   public abstract void Executa();
   public abstract void ScrieCod();
   public abstract void RuleazaTeste();
   public void Afiseazavarsta(Integer varsta){
       System.out.println("Varsta este "+ varsta);
   }


}



