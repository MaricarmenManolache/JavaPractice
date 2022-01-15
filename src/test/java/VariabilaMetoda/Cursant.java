package VariabilaMetoda;

import org.junit.Test;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Cursant {

    // nu mai multe teste intr-o clasa - best practice
    //am facut un comentariu
    //clasa= un sablon de variabile si metode, defineste un comportament
    //variabila= atributul unei clase
    //metoda= actiunea unei clase
    //tot timpul o clasa va avea langa nume cuvantul 'class'
    //o clasa trebuie sa aiba un nume= Cursant
    //o clasa trebuie sa fie publica=> (poate sa iti restrictioneze accesul daca nu este public) private, protected, public
    // VARIABILA= 2 tipuri: globala, locala
    // variabila globala= vizibila peste tot in clasa noastra
    //variabila globala structura= PUBLIC TipVariabila NumeVariabila
    // variabila locala = vizibila doar in locul unde am scris-o
    // variabila locala structura= TipVariabila NumeVariabila
    //o variabila poate sau nu sa primeasca o valoare
    //ca sa dam o valoare la o variabila, se face cu =

    // metodele sunt de 2 feluri: void si return
    //void cu rezultate
    // return= il tin numa pt mine
    //METODA void structura= public TipVariabila-void NumeMetoda(){}
    // METODA return structura= public (Double) TipVariabila NumeMetoda(){} (cu get in fata)
    //stringul este intre ghilimele
    public String nume;

    //am declarat o veriabila generala nume de tipul string

    public String prenume;

    //stringul le declara ca si caractere, chiar si numerele
    //integer= numar intreg
    //double=valoare cu virgula, dar punem punct

    public String adresa;
    public Integer adresaNumar;
    public Integer varsta;
    public  Double kg;
    public  Double experienta;

    @Test
    public void TestAutomat() {
     InscriereCurs();
     PlatesteTaxa();
    CalculeazaSuma();
   System.out.println(getSalar()+ " lei");
   System.out.print(getAdresa());
    }

   @Test
    public void InscriereCurs(){
        prenume= "Maricarmen";
        nume = "Manoalche";
        adresa= "Str. Crisului";
        adresaNumar=2;
        varsta= 23;
        kg= 58.9;
        experienta= 12.4;

        //afisam o valoare in consola(rezultate cod)
       //print= printeaza si ramane cu cursorul pe aceeasi linie
       // prinln= printeaza si merge dupa pe urmatoarea linie

        System.out.print(nume+" ");
        System.out.println(prenume+ " ");
       System.out.println(adresa+ ", ap. " +adresaNumar);
       System.out.println(varsta+ " ani");
       System.out.println(kg+ "kg");
       System.out.println(experienta+ " ani");
   }

    //variabile locale in interiorul metodei
    @Test
   public void PlatesteTaxa(){
       nume= "Manolache";
       prenume= "Maricarmen";
       //declaram si initializam o variabila locala
       Double Taxa=2.500;

       System.out.println("Cursantul cu numele: "+nume+ " si prenumele: "+ prenume+ " a platit taxa de "+String.format("%.3f", Taxa)+ " lei");
   }

   public void CalculeazaSuma(){
        //declaram 3 variabile care adunate sa fie 100

Integer suma=100;
Integer numar1= 30;
Integer numar2= 30;
Integer numar3= 50;
suma=numar1+numar2+numar3;
    System.out.println("suma celor 3 variabile este "+ suma);
   }

   public Double getSalar(){
        Double salar=3.300;
        //trebuie sa returnam ceva
       return salar;
   }

   public String getAdresa(){
        String adresa= "Strada Crisului, UC1, ap 2";
        return adresa;

   }

}
