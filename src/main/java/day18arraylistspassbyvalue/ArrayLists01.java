package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        //Ex: bir int ArrayLiset'teki 7 hariç
        // tüm elemanları iki artırınız.
        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

    for(Integer w : ages){

        if(w==7){
            continue;
        }
        //w = w + 2; List'ler böyle update edilemezler.
        ages.set(ages.indexOf(w), w+2);
    }
        System.out.println(ages);

        //Ex2: Size verilen ArrayList'te 8(inclusive) ve 8'den önceki tüm
        // elemanları iki katına çıkarınız.

        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(12);
        rakamlar.add(7);
        rakamlar.add(21);
        rakamlar.add(8);
        rakamlar.add(9);

        for(Integer x : rakamlar){

            rakamlar.set(rakamlar.indexOf(x), 2*x);
            if(x==8){
                break;
            }
        }
        System.out.println(rakamlar);
    }
}
