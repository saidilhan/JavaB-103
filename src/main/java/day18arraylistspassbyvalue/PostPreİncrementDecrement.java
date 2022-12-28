package day18arraylistspassbyvalue;

public class PostPreİncrementDecrement {

    public static void main(String[] args) {

        int a = 5;

        //Post Increment
        int b = a++;
        System.out.println(b);
        System.out.println(a);

        //Pre Increment
        int c = 10;
        int d = ++c;
        System.out.println(d);
        System.out.println(c);

        //Post Decrement
        int e = 20;
        int f = e--;
        System.out.println(f);
        System.out.println(e);

        //Pre Decremetn
        int h= 30;
        int ı = --h;
        System.out.println(ı);
        System.out.println(h);
    }
}
