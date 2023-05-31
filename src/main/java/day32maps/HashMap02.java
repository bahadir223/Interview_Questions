package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    /*
    !!!!!!!!!!!!!!!         cooooooooooooook meshur Interview Sorusu            !!!!!!!!!
    //Example 1: Type code to print the number of occurrences of words in a sentence
    //"I like to move it, move it do you like it?"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1
    Verilen cümledeki kelimelerin görünüm sayısını veren kodu yazınız.

     */

    public static void main(String[] args) {
        //like ile like? i aynı yapabilmek için tüm noktalama işaretlerini silelim.
        String s = "I like to move it, move it do you like it?";
        System.out.println(s);
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);

        //Ben kelimelerle çalışmalıyım bu yüzden split(" ") kullanacağım.

        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words)); //[I, like, to, move, it, move, it, do, you, like, it]

        //Adamın benden istediği çıktı Map formatında. Bu yüzden bir HashMap oluşturacağım...
        HashMap<String,Integer> occ = new HashMap<>();

        //"words" Array'indeki kelimeler birer birer Map'de var mı yok mu diye kontrol edilecek.
        //"words" Array'indeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerleştirilecek,
        //"words" Array'indeki kelimeler Map'de varsa Map'e var olan value 1 artırılarak yerleştirilecek.

        for(String w : words){

            Integer numOfOccurence = occ.get(w);

            if(numOfOccurence==null){

                occ.put(w,1);

            }else{

                occ.replace(w,numOfOccurence+1);

            }


        }

        System.out.println(occ);

    }
}
