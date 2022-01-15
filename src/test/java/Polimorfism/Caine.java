package Polimorfism;

public class Caine extends animal{

    public Caine(String rasa, Integer varsta, String nume) {
        super(rasa, varsta, nume);
    }

    //poli dinamic

    @Override
    public void scoateSunet() {
        System.out.println("cainele latra");
    }
    public void apeleazaMetodaParinte() {
            super.scoateSunet();
        }


    //poli static
    //diferentierea intre nr parametri sau tipul acestora
    public void cumparaProduse(){
        System.out.println("nu am cumparat niciun produs");
    }

    public void cumparaProduse(String produs1){
        System.out.println("Am cumparat mancare"+ produs1);
    }

    public void cumparaProduse(Integer varsrta1){
        System.out.println("Am cumparat mancare"+ varsrta1);
    }

   //------- la getter in return merge doar la nivel de diferentiere numar parametri nu si tip
   public Integer getCaine(){
        return 1;
    }

   public Integer getCaine(String numar){
       return 1;
   }

   // metoda return putem aplica polimorfismul dinamic
    //cel static doar la nivel de numar de parametri, nu si tipul acestora

    @Override
    public Integer getPret() {
        return super.getPret();
    }
}
