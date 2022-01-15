package MostenireIncapsulare;

import java.util.List;

public class Volkswagen extends TeorieMasina {

    private Integer pret;
    private String culoare;
    private List<String> dotari;
    private String model;

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public List<String> getDotari() {
        return dotari;
    }

    public void setDotari(List<String> dotari) {
        this.dotari = dotari;
    }

    public String getModel() {
        return model;
    }

    public Integer getPret() {
        return pret;
    }

    public void setModel(String model) {
        this.model = model;

    }

    @Override
    public String toString() {
        return "Volkswagen{" +
                "pret=" + getPret() +
                ", culoare='" + getCuloare() + '\'' +
                ", dotari=" + getDotari() +
                ", model='" + getModel() + '\'' +
                '}';
    }

    public Volkswagen(String caroserie, String transmisie, String tractiune, Integer usi, Integer locuri, Integer pret, String culoare, List<String> dotari, String model) {
        super(caroserie, transmisie, tractiune, usi, locuri);

        this.culoare = culoare;
        this.model = model;
        this.dotari = dotari;
        this.pret = pret;

    }

    public void InfoVolkswagen() {
        System.out.println("Detaliile despre masina Volkswagen model " + model + " sunt urmatoarele");
        System.out.println(toString());
    }

    public void pretfinal() {
        Integer pretfinal = pret;

        Integer index = 0;

        while (index < dotari.size()) {
            if (dotari.get(index).equals("volan incalzit")) {
                pretfinal = pretfinal + 50;
            }

            if (dotari.get(index).equals("scaun incalzit")) {
                pretfinal = pret + 55;

            }

            index++;

        }
      System.out.println(pretfinal);
    }

}