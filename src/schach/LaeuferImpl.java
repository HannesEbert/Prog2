package schach;

public class LaeuferImpl extends AbstractFigur implements Laeufer
{
    public LaeuferImpl(int x, int y)
    {
        super(x, y);
    }

    public Brett gibErlaubteFelder()
    {
        Brett brett = new Brett();

        //TODO: Erg�nzen Sie den Algorithmus zur Bestimmung der Felder

        for(int i = 1; x + i <= 8 && y + i <= 8; i++){
            brett.markiereFeld(x + 1, y + 1);
        }

        for (int i = 1; x + i <= 8 && y - i >= 1; i++) {
            brett.markiereFeld(x + i, y - i);
        }

        for (int i = 1; x - i >= 1 && y + i <= 8; i++) {
            brett.markiereFeld(x - i, y + i);
        }

        for (int i = 1; x - i >= 1 && y - i >= 1; i++) {
            brett.markiereFeld(x - i, y - i);
        }

        return brett;
    }

    public static void main(String[] args)
    {
        LaeuferImpl l = new LaeuferImpl(4,5);
        Brett brett = l.gibErlaubteFelder();
        System.out.println("  1 2 3 4 5 6 7 8");
        for (int j = 1; j <= 8; j++)
        {
            System.out.print(j + " ");
            for (int i = 1; i <= 8; i++)
            {
                if (brett.gibFeld(i, j)) System.out.print("x");
                else System.out.print("o");

                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

