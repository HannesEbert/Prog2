package Lektion15;

public class Abteilungsleiter extends Angestellter
{

    public Abteilungsleiter(String nachname, String vorname, String identifikator,
                            int gebTag, int gebMonat, int gebJahr,
                            double grundgehalt)
    {
        super(nachname, vorname, identifikator, gebTag, gebMonat, gebJahr, grundgehalt);
        this.gehaltsfaktor = 2;
    }

    public void befördern(Angestellter person){
        this.gehaltsfaktor = gehaltsfaktor + (gehaltsfaktor / 100 * 10);
    }
}
