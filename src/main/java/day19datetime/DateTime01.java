package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1: "Anlık tarihi"(Current Date) ekrana yazdıran kodu yazınız.
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);// 2022-10-21

        //Example 2: "Anlık zamanı"(Current Time) ekrana yazdıran kodu yazınız.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);// 20:41:23.419866900

        //Example 3: "Anlık tarihi"(Current Date) ve "Anlık zamanı"(Current Time) ekrana yazdıran kodu yazınız.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);// 2022-10-22T02:50:32.193221600

        //Example 4: Japonya'daki "anlık tarihi"(Current Date) ve "Anlık zamanı"(Current Time) ekrana yazdıran kodu yazınız.
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);// 2022-10-22T03:01:56.835257600

        //Example 5: Istanbul'daki "anlık tarihi"(Current Date) ve "Anlık zamanı"(Current Time) ekrana yazdıran kodu yazınız.
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);// 2022-10-21T21:01:56.835257600

        //Example 6: Bugünden 789 gün sonra emekli olacağınıza göre, emeklilik tarihini hesaplayan kodu yazınız.
        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);// 2024-12-18

        //Example 7: İki çocuğunuzun doğum tarhileri arasındaki farkı gün olarak hesaplayan kodu yazınız.
        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);

        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);// 2824

        //Example 8: Istanbul'un fethi ile, Cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız.
        //           29 Mayıs 1453 ==> İstanbul'un fethi           29 Ekim 1923 ==> Cumhuriyetin kuruluşu
        LocalDate republicDay = LocalDate.of(1923, 10, 29);
        LocalDate conquestOfIstanbul = LocalDate.of(1453, 5, 29);
        Long monthDifference = ChronoUnit.MONTHS.between(conquestOfIstanbul, republicDay);
        System.out.println(monthDifference);

        //Example 9: Verilen tarihin hangi burçta olduğunu gösteren kodu yazınız.
        LocalDate myDate = LocalDate.of(1989, 12, 12);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        //1.Yol:
        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }
        //2.Yol:
        if (day >= 21 && month == 3 || month == 4 && day <= 20) {
            System.out.println("Koç");
        }
        if (day >= 21 && month == 4 || month == 5 && day <= 20) {
            System.out.println("Boğa");
        }
        if (day >= 21 && month == 5 || month == 6 && day <= 21) {
            System.out.println("İkizler");
        }
        if (day >= 22 && month == 6 || month == 7 && day <= 22) {
            System.out.println("Yengeç");
        }
        if (day >= 23 && month == 7 || month == 8 && day <= 23) {
            System.out.println("Aslan");
        }
        if (day >= 24 && month == 8 || month == 9 && day <= 23) {
            System.out.println("Başak");
        }
        if (day >= 24 && month == 9 || month == 10 && day <= 23) {
            System.out.println("Terazi");
        }
        if (day >= 24 && month == 10 || month == 11 && day <= 22) {
            System.out.println("Akrep");
        }
        if (day >= 23 && month == 11 || month == 12 && day <= 21) {
            System.out.println("Yay");
        }
        if (day >= 22 && month == 12 || month == 1 && day <= 20) {
            System.out.println("Oğlak");
        }
        if (day >= 21 && month == 1 || month == 2 && day <= 19) {
            System.out.println("Kova");
        }
    }

}