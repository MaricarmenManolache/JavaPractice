package Interfete;

public class PersoanaInginer extends PersoanaInterface implements Inginer {
    public PersoanaInginer(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void Proiecteaza() {
        System.out.println("inginerul proiecteaza");
    }

    @Override
    public void Executa() {
        System.out.println("inginerul executa");
    }
}
