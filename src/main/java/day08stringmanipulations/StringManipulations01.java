package day08stringmanipulations;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= input.next();
        char ilkharf= isim.charAt(0);

        char sonharf = isim.charAt(isim.length()-1);

        System.out.println( " " + ilkharf + sonharf);

        String ilk = isim.substring(0,1);
        String son = isim.substring(isim.length()-1);
        System.out.println(ilk + son);

        String cümle = "ben kedi eşim tavuk oğlum inek sever";
        String hay1 = cümle.substring(4,8);
        String hay2 = cümle.substring(14,20);
        String hay3 = cümle.substring(26,31);
        System.out.println(hay1 + hay2 + hay3);

        System.out.println("lütfen isim ve soy isminizi giriniz...");
        String tamİsim = input.nextLine();
        String a = tamİsim.substring(0,1);
        String b = tamİsim.split("")[1].substring(0,1);
        System.out.println(a+ b);



    }
}
