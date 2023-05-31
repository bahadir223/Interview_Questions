package day13_loops;

public class Loops02 {
    /*
    break ile continue arasındaki fark nedir?
        "break" , switch'in dışına çıkmak için ve loop'u kırmak için kullanılır.
        "continue" ise loop yaparken bazı elemanları işleme sokmamak için kullanılır.
     */

    public static void main(String[] args) {
        // Interview Sorusu: Bir String'i ters çeviren yazdıran kodu yazınız. Java ==> avaJ

        //  1.Way
        String t = "Java";
        String ters = "";

        for (int i = t.length() - 1; i > -1; i--) {
            ters = ters + t.substring(i, i + 1);
            //System.out.println(ters); burada yazdirma islemimizi yaparsak butun adimlari yazdirir
        }
        System.out.println(ters);       //avaJ


        //  2.Way
        String u = "Apex";
        String ters2 = "";

        for (int i = u.length() - 1; i > -1; i--) {

            ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters2);      //xepA

    }
}
