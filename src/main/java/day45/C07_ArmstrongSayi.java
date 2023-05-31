package day45;

import java.util.Scanner;

public class C07_ArmstrongSayi {
    /*
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi
     Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami
         o sayiyi veriyorsa sayi  Armstrong sayidir.
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının armstrong sayı olup olmadıgını
          gösteren program yazınız.
           */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        int sayi = scan.nextInt();

        int basamak;
        int sayiKuplerToplami = 0;
        int girilenSayi = sayi;

        while (sayi > 0) {
            basamak = sayi % 10;  // 153 --  3  /// 15 -- 5  // 1
            sayiKuplerToplami += (basamak * basamak * basamak); //27 = sayikupleriToplami  + 125   = 152 +1 // 153
            sayi = sayi / 10;  // 15  // 1 // 0


        }        // 153                      0
        if (sayiKuplerToplami == girilenSayi) {
            System.out.println(girilenSayi + " sayisi Armstrong sayidir");
        } else {
            System.out.println(girilenSayi + " sayisi Armstrong sayi degildir");
        }

    }
}
