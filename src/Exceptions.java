package Lektion17.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions
{
    public static void main(String[] args){

        System.out.print("a)\t");
        // NumberFormatException
        try
        {
            String str = "abc";
            int number = Integer.parseInt(str);

        } catch(NumberFormatException e){
            System.out.println(e);
        }

        System.out.print("b)\t");
        // ArrayIndexOutOfBoundsException
        try
        {
            int[] array = new int[1];
            array[5] = 100;

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.print("c)\t");
        // ArrayIndexOutOfBoundsException
        try
        {
            String str = null;
            int length = str.length();

        } catch(NullPointerException e){
            System.out.println(e);
        }

        System.out.print("d)\t");
        // OutOfMemoryError
        try{
            Object[] memoryLeak = new Object[1000000];
            for (int i = 0; ; i++) {
                memoryLeak[i % memoryLeak.length] = new byte[10_000_000]; // 10 MB pro Durchlauf
            }
        } catch (OutOfMemoryError e){
            System.out.println(e);
        }

        System.out.print("e)\t");
        // FileInputStream
        try
        {
            FileInputStream fis = new FileInputStream("pic.jpg");

        } catch(FileNotFoundException e){
            System.out.println(e);
        }

        System.out.print("f)\t");
        // ArrayIndexOutOfBoundsException
        try
        {
            int x = 100 / 0;

        } catch(ArithmeticException e){
            System.out.println(e);
        }








    }
}
