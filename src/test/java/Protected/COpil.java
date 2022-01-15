package Protected;

public class COpil {
    // pub;ic vizibil peste tot in proiect
    //private vizibil doar in clasa
    // protected vizibil doar in clasa printe si copil vizibil daca se afla in acelasi pachet
    // default vizivil parinte+copil sa fie in acelasi pachet
    // protected= daca declaram un obiect este vizibil in orice clasa din pachet
    // default= daca declaram un obiect est evizibil in orice clasa din pachet
    public void metodapublica() {
        System.out.println("public");
    }
        private void metprivata() {
            System.out.println("privata");
        }
    protected void Metprotected(){
                System.out.println("protected");
            }
    void Metdefault(){
        System.out.println("default");
    }


}
