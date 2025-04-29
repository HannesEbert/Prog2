package Lektion17.Zeitmessung;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie den Pfad zur Musikdatei ein: ");
        Scanner input = new Scanner(System.in);
        String pfad = input.nextLine();

//
        InputStream fis = null;
        OutputStream fos = null;
        try{
            fis = new FileInputStream(pfad);
            fos = new FileOutputStream(String.valueOf(fis));
            int b;
            do{
                b = fis.read();
                if(b != -1) fos.write(b);
            } while (b != -1);
        } catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if(fis != null) fis.close();
            } catch (IOException e){}
            try{
                if(fos != null) fos.close();
            } catch (IOException e){}

        }

//
    }
}
