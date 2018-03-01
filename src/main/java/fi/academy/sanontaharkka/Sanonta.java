package fi.academy.sanontaharkka;

public class Sanonta {

    private String teksti;
    private String kertoja;
    private int id;

    public Sanonta() {
    }

    public Sanonta(String teksti) {
        this.teksti = teksti;
    }

    public Sanonta(String teksti, String kertoja) {
        this.teksti = teksti;
        this.kertoja = kertoja;
        this.id = id; //id:n pitää päivittyä automaattisesti
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
