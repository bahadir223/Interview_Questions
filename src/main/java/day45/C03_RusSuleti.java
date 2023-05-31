package day45;

public class C03_RusSuleti {
    /*
        ================== RUSSULETI ======================
        Birbirleriyle çarpılacak sayılar yan yana yazılır.
        ilk sayı ikiye bölünür ve sonuç hemen altına yazılır.
        sonuç küsuratlı(kesirli) çıktıysa kesir kısmıyla ilgilenilmez
        sadece tam sayı kısmı yazılır. diğer sayı ise ikiyle çarpılır
        ve sonuç hemen altına yazılır.
        bu işlem yeni sayılar için tekrarlanır,
        ta ki ilk sayı ikiye bölüne,
        bölüne 1(bir) değerine ulaşana kadar.
        birinci sütundaki çift sayıların
        ikinci sütundaki karşılıkları silinir.
        ikinci sütunda silinmeyen sayılar
        toplandığında elde edilen sonuç
        istenilen sayıdır.
            örnek:
        456 x 219 = ? 99864
        456........219
        228........438
        114........876
        57 ........1752
        28 ........3504
        14 ........7008
        7  ........14016
        3  ........28032
        1  ........56064
     */
    //Fazıl Hocanın Cozumu
    public static void main(String[] args) {


        int num1 = 456;
        int num2 = 219;
        int toplam = 0;

        do {

            System.out.print(num1 + "\t.......\t");

            if (num1 % 2 == 0) {

                num1 = num1 / 2;

            } else {

                toplam += num2;
                num1 = num1 / 2;

            }

            System.out.println(num2 + "\t");

            num2 *= 2;


        } while (num1 != 0);

        System.out.println();

        System.out.println("456 X 219 = " + toplam);

        //Hocanın Cozumu
        /*
        package day05;

public class C03_Russuleti {


    public static void main(String[] args) {
        int ilkSayi = -455;//-99645
        int ikinciSayi = 219;


        System.out.println(carpim(ilkSayi, ikinciSayi));

    }
    public static int carpim(int ilkSayi, int ikinciSayi) {
        boolean negatif = false;
        if(ilkSayi<0){
            ilkSayi= -ilkSayi;
            negatif =! negatif;
        }
        if(ikinciSayi<0){
            ikinciSayi= -ikinciSayi;
            negatif =! negatif;
        }

        int toplam = 0;
        do{


            if(ilkSayi %2 !=0){//ilkSayi Tek sayi ise
                toplam = toplam+ikinciSayi;//ikinci sayiyi toplam variable'ina toplayarak ata
            }
            ilkSayi = ilkSayi/2;
            ikinciSayi = ikinciSayi * 2;

        }while(ilkSayi>=1);//ilkSayi 1 oluncaya kadar calis

        if(negatif)
            toplam =- toplam;
        return toplam;
    }
}
         */
    }

}
