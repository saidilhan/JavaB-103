package day08stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        String str = "Ali okula gitti.";
        int num = str.replace(" ", "").length();
        System.out.println(num);

        String s = "Ankaranın yşaına bak gözlerimin yaşına bak";
        String news = s.replace("a" , "A");
        System.out.println(news);


        String c= "Kara kara düşünme Ankara";
        String newc = c.replace("kara" , "*");
        System.out.println(newc);


        String stID = "AC492330885";
        String newS = stID.replaceAll("[0-9]" , "*");
        System.out.println(newS);
    }
}
