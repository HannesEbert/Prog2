package muenzautomat;

/** Die nachfolgende Klasse beinhaltet einen sehr einfachen
 * Algorithmus zur Ermittlung des Wechselgelds: Es wird
 * der gesamte Betrag in 1-Cent-Muenzen ausgegeben.
 */
public class SimpleChangeCalculator implements ChangeCalculator
{
    public int[] getChange(int euros, int cent)
    {
        int einCent, zweiCent, fünfCent, zehnCent, zwanzigCent, fünfzigCent, einEuro, zweiEuro;
        zweiEuro = euros / 2;
        einEuro  = euros % 2;

        fünfzigCent = cent / 50;

        cent = cent % 50;
        zwanzigCent = cent / 20;

        cent = cent % 20;
        zehnCent = cent / 10;

        cent = cent % 10;
        fünfCent = cent / 5;

        cent = cent % 5;
        zweiCent = cent / 2;

        cent = cent % 2;
        einCent = cent;

        return new int[] {
                einCent,
                zweiCent,
                fünfCent,
                zehnCent,
                zwanzigCent,
                fünfzigCent,
                einEuro,
                zweiEuro
        };
    }
}
