package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        //example 1: kullanici gun nuamarasini girsin kod ise gun ismini yazsin
        //yani 2 yazdiysa orn pazartesi 5 ise persembe

        Scanner input = new Scanner(System.in);

        System.out.println("gun numarasini giriniz");
        byte gunNo = input.nextByte();

        if (gunNo==1){

            System.out.println("pazar");
        } else if (gunNo==2) {

            System.out.println("pazartesi");

        }else if (gunNo==3) {

            System.out.println("sali");

        }else if (gunNo==4) {

            System.out.println("carsamba");

        }else if (gunNo==5) {

            System.out.println("persembe");

        }else if (gunNo==6) {

            System.out.println("cuma");

        }else if (gunNo==7) {

            System.out.println("cumartesi");
        }else{
            System.out.println("gecerli bir gun numarasini giriniz gecerli gun numaralari 1 2 3 4 5 6 7 ");
        }



    }
}
