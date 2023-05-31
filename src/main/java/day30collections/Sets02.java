package day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    // !!!! Meşhur Bir Interview Sorusu !!!!!
    //Example 1: Ogrenci eMail adreslerini Natural Order'da siralanmis olarak depolayiniz.

    public static void main(String[] args) {

        //1.Way:
        TreeSet<String> eMails = new TreeSet<>();
        eMails.add("abc@gmail.com");
        eMails.add("abd@gmail.com");
        eMails.add("abe@gmail.com");
        eMails.add("abf@gmail.com");
        eMails.add("abg@gmail.com");
        eMails.add("abh@gmail.com");
        eMails.add("abi@gmail.com");
        eMails.add("abj@gmail.com");
        eMails.add("abk@gmail.com");
        eMails.add("abl@gmail.com");

        System.out.println(eMails);

        //2.Way:
        HashSet<String> eMailsHs = new HashSet<>();
        eMailsHs.add("abc@gmail.com");
        eMailsHs.add("abd@gmail.com");
        eMailsHs.add("abe@gmail.com");
        eMailsHs.add("abf@gmail.com");
        eMailsHs.add("abg@gmail.com");
        eMailsHs.add("abh@gmail.com");
        eMailsHs.add("abi@gmail.com");
        eMailsHs.add("abj@gmail.com");
        eMailsHs.add("abk@gmail.com");
        eMailsHs.add("abl@gmail.com");

        TreeSet<String> eMailsHsTs = new TreeSet<>(eMailsHs);   //eMailsHs'ten olusturulmus TreeSet. Bu daha hizli calisir.
        System.out.println(eMailsHsTs);

    }
}
