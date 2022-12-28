package day18arraylistspassbyvalue;

public class PassByValue01 {

    public static void main(String[] args) {

        /*
        1)Java, variable'ların orijinal değerlerini korumak ister.
        2)Variable metotlar içinde kullanıldığında, Java metodun içine
        orijinal değer koymaz, o değerin kopyasını üretir ve metoda o kopyayı yollar.
        Metot kopya üstünde değişiklik yapar, dolayısıyla variable'ın
        orijinal değer korunmuş olur. Bu sisteme PassByValoue denir.

        Note: Java Pass By Value kullanir.
        Note: Bazi programlama dilleri orjinal degeri koruma altina almamistir.Bu isi Developer'lara birakmistir.
        Bu tarz diller Pass by Referance kullanir

         */

        int x = 5;
        System.out.println(x);//5
        //static metod olan 'main method'un içindeki her şey
        //static olmalıdır.
        change(x);
        System.out.println(x);//?
    }

    public static void change(int a) {
        System.out.println(a*3);
    }
    //Void dışındaki 'return type'larda 'method body'si içinde
    //'return' keyword kullanılmalıdır.
    public static int indirim(int gömlekÜcreti){
       return gömlekÜcreti - 10;
    }
}


