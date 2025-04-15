package schach;

public class Brett
{
    boolean[][] brett = new boolean[8][8];

    public Brett()
    {

    }

    public boolean isMarkiert(int x, int y){
        return brett[x][y];
    }

    public void markiereFeld(int x, int y)
    {
        brett[x-1][y-1] = true;
    }

    public boolean gibFeld(int x, int y)
    {
        return brett[x-1][y-1];
    }

    public Brett kombiniere(Brett übergeben){

        Brett neu = new Brett();

        for(int i = 1; i <= 8; i++){
            for(int j = 1; j <= 8; j++){
                if(brett[i][j] || übergeben.isMarkiert(i,j)){
                    neu.markiereFeld(i, j);
                }
            }
        }

        return neu;
    }
}
