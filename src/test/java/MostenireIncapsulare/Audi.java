package MostenireIncapsulare;

import java.util.List;

public class Audi extends TeorieMasina {

//copilul trebuie sa ia constructorul parintelui
    private String culoare;
    private List<String> dotari;
    private Integer pret;
    private String model;


    public Audi(String caroserie, String transmisie, String tractiune, Integer usi, Integer locuri, String culoare,List<String> dotari, Integer pret, String model) {
        super(caroserie, transmisie, tractiune, usi, locuri);

        this.culoare= culoare;
        this.dotari= dotari;
        this.pret= pret;
        this.model= model;


    }

    public void InfoMasina(){
        System.out.println("Detaliile despre masina Audi model "+ model+ " sunt urmatoarele");
        System.out.println(toString());
    }

    public void pretfinal() {
        Integer pretfinal=pret;

        Integer index = 0;
        while (index < dotari.size()) {
            if (dotari.get(index).equals("interior piele")) {
                pretfinal = pret + 4000;
            }
            if (dotari.get(index).equals("volan incalzit")) {
                pretfinal = pretfinal + 2000;
            }
            if (dotari.get(index).equals("incalzire scaun")) {
                pretfinal = pretfinal + 3000;
            }
            if (dotari.get(index).equals("trapa")) {
                pretfinal = pretfinal + 7000;
            }

            index++;
        }
        System.out.println("pretul final al masinii audi a4 este "+ pretfinal);
        System.out.println("                             ");

    }

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
        return "Audi{" +
                "culoare='" + getCuloare() + '\'' +
                ", dotari=" + getDotari() +
                ", pret=" + getPret() +
                ", model='" + getModel() + '\'' +
                ", caroserie='" + getCaroserie() + '\'' +
                ", transmisie='" + getTransmisie()+ '\'' +
                ", tractiune='" + getTractiune()+ '\'' +
                ", usi=" + getUsi() +
                ", locuri=" + getLocuri() +
                '}';

    }


}
