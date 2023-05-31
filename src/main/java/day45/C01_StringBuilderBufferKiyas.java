package day45;

public class C01_StringBuilderBufferKiyas {
    /*
    2023 Nisan QA Tester
 * For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani
 * kontrol edip StringBuilder ,String Buffer ve String class'larinin performanslarini
 * karsilastiralim.
 * Ipucu: long TimeSb = System.nanoTime(); kullanalim...
 */
    public static void main(String[] args) {
        String str = "Merhaba";

        System.out.println("-----------------------------String---------------------------------");
        long timeBaslangic = System.nanoTime();

        for (int i = 0; i < 1000; i++) {
            str += "  ";
        }
        long timeBitis = System.nanoTime();

        long stringSure = (timeBitis - timeBaslangic);
        System.out.println("Harcanan Süre = " + stringSure);


        System.out.println("-----------------------------StringBuffer---------------------------------");
        StringBuffer stf = new StringBuffer("Merhaba");
        long time1 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            stf.append(" ");
        }
        long time2 = System.nanoTime();

        long bufferSure = (time2 - time1);
        System.out.println("Harcanan Süre = " + bufferSure);

        System.out.println("-----------------------------StringBuilder---------------------------------");
        StringBuilder stb = new StringBuilder("Merhaba");
        long time3 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            stb.append(" ");
        }
        long time4 = System.nanoTime();

        long builderSure = (time4 - time3);
        System.out.println("Harcanan Süre = " + builderSure);

        System.out.println("*************************** Kıyaslama**************************");
/*
        String result = builderSure < bufferSure ? (builderSure < stringSure ? ("En hızlı olan Class = StringBuilder Class") : ("En hızlı olan Class = String Class")) : ("En hızlı olan Class = StringBuffer Class");
        System.out.println(result);*/


        System.out.println("************************** Uclu Kiyas **********************");
        if (stringSure > bufferSure && stringSure > builderSure) {
            System.out.println("En yavas String Class'dir.");
            if (bufferSure > builderSure) {
                System.out.println("Ikinci yavas Buffer Classidir");
                System.out.println("En hizlisi Builder Classidir");
            } else {
                System.out.println("Ikinci yavas Builder Classidir");
                System.out.println("En hizlisi Buffer Classidir");
            }
        } else if (bufferSure > stringSure && bufferSure > builderSure) {
            System.out.println("En yavas Buffer Classidir");
            if (stringSure > builderSure) {
                System.out.println("Ikinci yavas String Classidir");
                System.out.println("En hizlisi Builder Classidir");
            } else {
                System.out.println("Ikinci yavas Builder Class'idir");
                System.out.println("En hizlisi String Class'idir");
            }
        } else {
            System.out.println("En yavas Builder Class'idir ");
            if (builderSure > stringSure) {
                System.out.println("Ikinci yavas Buffer Class'idir");
                System.out.println("En hizlisi String Class'idir");
            } else {
                System.out.println("Ikinci yavas String Class'idir");
                System.out.println("En hizlisi Buffer Class'idir");
            }
        }
    }
}

