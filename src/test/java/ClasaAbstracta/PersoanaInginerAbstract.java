package ClasaAbstracta;

public class PersoanaInginerAbstract extends  PersoanaAbstract{


    public String nume;
    public String prenume;

    public PersoanaInginerAbstract(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public void Proiecteaza() {
        System.out.println("Ig " + nume+ " proiecteaza");
    }

    @Override
    public void Executa() {
        System.out.println("Ig executa ");
    }

    @Override
    public void ScrieCod() {

    }

    @Override
    public void RuleazaTeste() {

    }
}
