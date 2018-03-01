package fi.academy.sanontaharkka;

public class Sanonta {

    private String teksti;
    private String kertoja;
    private static int laskuri = -1;
    private int id;

    public Sanonta() {
        laskuri++;
        this.id = laskuri;
    }

    public Sanonta(String teksti) {
        this.teksti = teksti;
    }

    public Sanonta(String teksti, String kertoja) {
        this.teksti = teksti;
        this.kertoja = kertoja;
        laskuri++;
        this.id = laskuri;
    }

    public String getTeksti() {
        return teksti;
    }

    public void setTeksti(String teksti) {
        this.teksti = teksti;
    }

    public String getKertoja() {
        return kertoja;
    }

    public void setKertoja(String kertoja) {
        this.kertoja = kertoja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
