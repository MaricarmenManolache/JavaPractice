package Interfete;

public class PersoanaInginerItInterface extends  PersoanaInterface implements Inginer, ITist {

    public PersoanaInginerItInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void ScrieCOd() {
        System.out.println("Inginerul itist scriecod");
    }

    @Override
    public void Ruleazateste() {
        System.out.println("Inginerul itist ruleaza teste");
    }

    @Override
    public void Proiecteaza() {
        System.out.println("Inginerul itist Proiecteaza");
    }

    @Override
    public void Executa() {
        System.out.println("Inginerul itist executa");
    }
}




