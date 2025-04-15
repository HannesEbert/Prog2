package Lektion15;

public class Angestellter {
    String nachname, vorname, identifikator;
    int gebTag, gebMonat, gebJahr;
    double grundgehalt, gehaltsfaktor;

    public Angestellter(String nachname, String vorname, String identifikator,
                        int gebTag, int gebMonat, int gebJahr,
                        double grundgehalt)
    {
        this.nachname =      nachname;
        this.vorname =       vorname;
        this.identifikator = identifikator;
        this.gebTag =        gebTag;
        this.gebMonat =      gebMonat;
        this.gebJahr =       gebJahr;
        this.grundgehalt =   grundgehalt;
        this.gehaltsfaktor = 1;
    }
}

