package Interfete;

public class PeroanaItistInterface extends PersoanaInterface implements ITist {
    public PeroanaItistInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void ScrieCOd() {
        System.out.println("Itistul scrie cod");
    }

    @Override
    public void Ruleazateste() {
        System.out.println("Itistul ruleaza cod");
    }
}
