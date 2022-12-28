package day18arraylistspassbyvalue;

public class Varargs01 {

    /*
    1)Farklı sayılardaki parametrelerle çalışabilen bir method
    oluşturmak isterseniz 'varargs' kullanmalısınız.
    2)'varrargs' arka tarafta 'arrays' kullanır, bu yüzden
    'varrargs'larla çalışırken 'array'lerle çalışıyormuş gibi davranabilirsiniz.
    3)'varargs' oluşturmak için ''<data type> ... <varargs ismi>''
    4)Bir method'da 'varargs'ın yanında başka bir parametre kullanılabilir mi?
    'varargs' en sonda olmak şartı ile kullanılır.
    5)Bir method'da birden fazla 'varargs' kullanılabilir mi?
    'varargs' en sonda olmak zorunda olduğundan, birden fazla kullanıldığında
    en az biri en sonda olamayacaktır. Bu durum da 4. maddedeki kural ile çelişir.

     */

    public static void main(String[] args) {


        int r1 = add(2, 3);
        System.out.println(r1);

        int r2 = add(2, 3, 4);
        System.out.println(r2);
        int r3 = add(2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(r3);

    }
     /*
        //Iki sayinin toplamini return eden bir method olusturunuz.
    public static int add(int a, int b) {
    return a + b;
        }
    public static int topla(int x, int y, int z){
        return x + y + z;
    }
    public static int toplamak(int d, int e, int f){
        return d + e + f;
    }



      */
    //İstediğimiz kadar toplayabileceğimiz bir method oluşturalım.
    public static int add(int... a){

        int sum = 0;
        for(int w : a){
            sum = sum + w;
        }
        return sum;
    }

}
