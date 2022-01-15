package Interfete;

import org.junit.Test;

public class InterfataTest {

    @Test
    public void TestAutomat() {
    PeroanaItistInterface Mari= new PeroanaItistInterface("Man", "Mari");
    Mari.Ruleazateste();
    Mari.ScrieCOd();

    PersoanaInginer Flo= new PersoanaInginer("Flo", "Ma");
    Flo.Executa();
    Flo.Proiecteaza();

    PersoanaInginerItInterface Ma= new PersoanaInginerItInterface("Ma", "Man");
    Ma.ScrieCOd();
    Ma.Ruleazateste();
    Ma.Executa();
    Ma.Executa();

    }
}
