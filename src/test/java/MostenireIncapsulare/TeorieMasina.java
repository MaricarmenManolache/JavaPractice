package MostenireIncapsulare;

public class TeorieMasina {
    // mostenire- conceptul prin care o clasa mosteneste o alta clasa
    //clasa care mosteneste - (copil)
    //clasa care este mostenita- (parinte)
    //in momentul in care o clasa mosteneste o alta clasa=> are acces la toate variabilele/metodele daca aceste sunt publice
    // se foloseste un cuvant ceie EXTENDS
    // in java putem mosteni o singura clasa

//private ramane in acea clasa
    //constructorul e mereu public

    private String caroserie;
    private String transmisie;
    private String tractiune;
    private Integer usi;
    private Integer locuri;


    public TeorieMasina(String caroserie, String transmisie, String tractiune, Integer usi, Integer locuri) {
        this.caroserie = caroserie;
        this.transmisie = transmisie;
        this.tractiune = tractiune;
        this.usi = usi;
        this.locuri = locuri;


    }
// get scoate
    // set modifica
    public String getCaroserie() {
        return caroserie;
    }

    public void setCaroserie(String caroserie) {
        this.caroserie = caroserie;
    }

    public String getTransmisie() {
        return transmisie;
    }

    public void setTransmisie(String transmisie) {
        this.transmisie = transmisie;
    }

    public String getTractiune() {
        return tractiune;
    }

    public void setTractiune(String tractiune) {
        this.tractiune = tractiune;
    }

    public Integer getUsi() {
        return usi;
    }

    public void setUsi(Integer usi) {
        this.usi = usi;
    }

    public Integer getLocuri() {
        return locuri;
    }

    public void setLocuri(Integer locuri) {
        this.locuri = locuri;
    }
}
