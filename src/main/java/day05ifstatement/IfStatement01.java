package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {


        //Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int s = input.nextInt();

        //1.yol:
        if (s % 2 == 0) {

            System.out.println("Cift sayi...");
        }

        if (s % 2 != 0) {  //"!=" demek "Esit degil demektir"

            System.out.println("Tek sayi...");
        }

        //2.Yol:

        if (s % 2 == 0) {
            System.out.println("Cfit sayi...");
        } else {
            System.out.println("Test sayi...");

        }

        //Example 2: Bir sayinin negatif, pozitif veya notr oldugunu soyleyen kodu yaziniz.
        System.out.println("Bir sayi giriniz...");

        double d = input.nextDouble();
        if (d>0) {
            System.out.println("Positive");
        } else if (d==0) {
            System.out.println("Notr");
        }else {
            System.out.println("Negative");
        }




    }
}
