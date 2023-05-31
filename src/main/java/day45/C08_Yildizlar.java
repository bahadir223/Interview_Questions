package day45;

public class C08_Yildizlar {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
     */

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++)          // satırları tutuyoruz.
        {
            for (int j = 7; j > i; j--) {
                System.out.print(" ");      // boşlukları tutuyoruz.
            }

            for (int k = i; k > 0; k--) {
                System.out.print("* ");     // yıldızları tutuyoruz.
            }
            System.out.println();
        }

        /*
        for (int i = 1; i <6 ; i++) {         //satir
                for (int j =7-i; j>1 ; j--) {  //bosluk
                    System.out.print(" ");
                }
                for (int j = 1; j <=i ; j++) { // yildiz
                    System.out.print("* ");

                }
                System.out.println();
            }

        }
         */
    }
}
