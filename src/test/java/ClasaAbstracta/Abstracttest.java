package ClasaAbstracta;

import org.junit.Test;

public class Abstracttest {

    @Test

    public void TestAutomat(){

        PersoanaInginerAbstract Mari= new PersoanaInginerAbstract("Mari", "Man");
        Mari.Proiecteaza();
        Mari.Executa();
        Mari.Afiseazavarsta(23);

        persoanaItistAbstract Flo= new persoanaItistAbstract("Florian", "Florescu");
        Flo.ScrieCod();
        Flo.RuleazaTeste();
        Flo.Afiseazavarsta(37);

        PersoanaIngITAbstract Alex= new PersoanaIngITAbstract("Alex", "Alexandrdu");
        Alex.Executa();
        Alex.Proiecteaza();
        Alex.ScrieCod();
        Alex.RuleazaTeste();
        Alex.Afiseazavarsta(72);
    }
}






