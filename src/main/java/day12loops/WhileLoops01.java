package day12loops;

public class WhileLoops01 {

    public static void main(String[] args) {


        //Example 1: 3'den 10'a kadar tamsayıları aynı satırda ekrana yazdıran kodu yazınız.

        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //2. Yol:
        int i = 3;

        while (i < 11) {
            System.out.print(i + " ");

            i++;
        }
        System.out.println();

        //Example 2: 17'den 4'e kadar tüm çift sayıları ekrana aynı satırda yazdıran kodu yazınız.

        int k = 17;

        while (k > 4) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }

            k--;
        }

        //Example 3: 12'den 67'ye kadar sayıların toplamını veren kodu yazınız.
        int sum = 0;
        int m = 12;

        while (m < 68) {
            sum = sum + m;

            m++;
        }
        System.out.println(sum);


        //Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz


        /*
        for (int i = 3; i < 11; i++) {
        System.out.print(i);
        }

        //2. yol:
        int i=3;
        while (i<11){
        System.out.println(i+ " ");
        i++;
        }
    */


        /*
        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
        int k =17;
        while(k>3){
        if (k%2==0){
        System.out.print(k+" ");
        }
        k--;
        }
        System.out.println();   */

        //Example 3: 12 den 67 ye kadar sayilarin toplamini veren kodu yazınız


    /*
        int sum=0;
        int m = 12;

        while(m<68){

        sum = sum +m;

        m++;

        }
        System.out.println(sum);

        }
        }
*/

    }
}