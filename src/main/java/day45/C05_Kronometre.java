package day45;

import java.util.Scanner;

public class C05_Kronometre {
    // 2023 QA INTERWIEW QUESTIONS

    /*
      KRONOMETRE  2023/04 QA INTERWIEW
     Kullanıcının belirlediği sayıda işlemi gerçekleştiren,
     sonunda toplam süreyi ve
     ortalama süreyi kullanıcıya gösteren bir kronometre
     kodunu yaziniz.
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kac kez islem yapilcagini giriniz ");
        int numTasks = input.nextInt();// numTasks :  gorev sayisi


        long starTime = System.currentTimeMillis();//currentTimeMillis(); milisaniye olarak ani verir.

        System.out.println("************************");
        for (int i = 0; i < numTasks; i++) {
            int numbers[] = {1, 2, 3, 4, 5};
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("sum = " + sum);
            System.out.println("Islem " + (i + 1) + " tamamlandi");
            System.out.println("******************");

        }//fori
        long endTime = System.currentTimeMillis();

        long islemSuresi = endTime - starTime;
        System.out.println("*************************");
        System.out.println("islemSuresi = " + islemSuresi);
        System.out.println("OrtalamaSure : " + ((double) islemSuresi / numTasks) + " milisaniye");

    }
}
