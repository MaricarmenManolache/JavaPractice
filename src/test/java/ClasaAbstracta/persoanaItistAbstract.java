package ClasaAbstracta;

public class persoanaItistAbstract extends  PersoanaAbstract{
    public String nume;
    public String prenume;

    public persoanaItistAbstract(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public void Proiecteaza() {

    }

    @Override
    public void Executa() {

    }

    @Override
    public void ScrieCod() {
        System.out.println(" Itistul "+ nume +" Scrie cod");
    }

    @Override
    public void RuleazaTeste() {
        System.out.println(" Itistul "+ nume+ " ruleaza teste");
    }
}
