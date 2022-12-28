package day09stringmanipulations;

import java.util.Scanner;

public class StringManupilatons01 {

    public static void main(String[] args) {

        String str = "Kara kara düşünme Ankara";

        //indxof() method'u verilen chacter veya charcter'lerin ilk görünümünün index'ini verir.
        int idxA = str.indexOf("kara");
        System.out.println(idxA);

        //lastindexOf() method'u verilen character veya chracterlerin son görünümlerinin index'ini verir.
        int idxA2 = str.lastIndexOf("kara");
        System.out.println(idxA2);

        String s = "Mississipi";
        int idxI = s.indexOf('i'); //indexOf() hem String hem de char ile kullanılabilir.
        System.out.println(idxI);

        int iss = s.indexOf("iss");
        System.out.println(iss);

        int iss2 = s.lastIndexOf("iss");
        System.out.println(iss2);

        //Ex1: Bir string'deki bir characterin tekrarlı veya tekrarsız olup olmadığını gösteren kodu yazınız

        String t = "Hello";

        char c = 'H';

        if(t.indexOf(c) == t.lastIndexOf(c)) {
            System.out.println("Tekrarsız");
        } else{
            System.out.println("Tekrarlı");
        }


    //indexOf() iki parametre ile kullanılırrsa ikinci parametrede verilen sayı kadar character i geçtikten sonra istenen character in
        // ilk görünümnün indexini return eder..
        String u = "Learn Java earn money";

        int sonuc = u.indexOf("n",5);

        System.out.println(sonuc);


        //LastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabul edip en baştan bu indeXe kadar olan karakterleri bir
        //bu indexe kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf() method'unu sadece bu kutu icindeki String icin kullaniniz.
        String m ="Hello everyone!";
        int e = m.lastIndexOf("e" , 7);
        System.out.println(e);

        // isEmptty() method'u bir String in boş olup olmadığı kontrol eder.
        // Eğer Strin'de hiç characteryoksa isEMpty() true returrn eder, herhangi bir character varsa false return eder.
        // length()==0 demek Emptt() true verir demektir.
        // Bir String'in boş olup olmadığını anlamak için length()==0 kullanmayın, isEmpty() kullanın.
        String v = "Java is Java";
        boolean boşMu = v.isEmpty();

        System.out.println(boşMu);


        //isblank() hem boş string için hem de sadece space içeren stringler için true return eder.
        String x = "";


        boolean blankMi = x.isBlank();
        System.out.println(blankMi);


        //ex2: Kullanıcıdan alınan isiim mutlaka spaceden farklı en az bir character içermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk isminizi giriniz");
        String ilk = input.nextLine();

        if(ilk.isBlank()){
            System.out.println("İsmini yaz dedim");
        }else{
            System.out.println(ilk);
        }







    }
}
