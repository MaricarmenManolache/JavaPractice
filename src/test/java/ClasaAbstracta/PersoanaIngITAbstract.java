package ClasaAbstracta;

public class PersoanaIngITAbstract extends PersoanaAbstract{

    public String nume;
    public String prenume;

    public PersoanaIngITAbstract(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public void Proiecteaza() {
        System.out.println(" Ing "+ nume +" proiecteaza");
    }

    @Override
    public void Executa() {
        System.out.println(" Ing "+ nume + " executa");
    }

    @Override
    public void ScrieCod() {
        System.out.println(" IT "+ nume + " Scrie cod");
    }

    @Override
    public void RuleazaTeste() {
        System.out.println(" IT " + nume + " ruleaza test");
    }
}
