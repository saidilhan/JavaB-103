package day18arraylistspassbyvalue;

public class MethodOverloading01 {

    /*Method Overloading nasil yapilir?
1=)Method isimleri ayni olmali
2=)Method parametreleri farkli olmali
 a=)Paramtre sayilari degistirilebilir
 b=)Parametrelerin data tiplerini degistirebilirsin
 c=)Parametrelerin yerlerini degistirebilirsin;ancak (data tipleri farkliysa)
3) Methos İsmi + Parametreler = Method Signature
Method Signature dışında ne değiştirirseniz değiştirin
Java o methodları farklı kabul etmez.

 */

    public static void main(String[] args) {

    }

    public static void add(int a, int b) {
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public static void main(int a, double b) {
        System.out.println(a+b);
    }

    public static void add(double a, int b) {
        System.out.println(a+b);


    }
}
