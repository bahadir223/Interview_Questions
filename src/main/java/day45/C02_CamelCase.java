package day45;

import java.util.Arrays;

public class C02_CamelCase {
    /*
    // INTERWIEW QUESTIONS QA AUTOMATION Nisan 2023

    String str = "cats AND*Dogs-are Awesome"
    Verilen String Datanin her bir kelimenin ilk harfini
    buyuk harf diger harfleri kucuk harf olacak
    "CatsAndDogsAreAwesome" sekilde veren kodu yaziniz.
    input  ==> "cats AND*Dogs-are Awesome"
    output ==> "CatsAndDogsAreAwesome
 */

    /*
        input==> "cats AND*Dogs-are Awesome"
        output ==>"CatsAndDogsAreAwesome
        */

    public static void main(String[] args) {

        String str = "cats AND*Dogs-are Awesome";
        String[] arr = str.split("[^a-zA-Z]");
        System.out.println(Arrays.toString(arr));

        for (String w : arr) {
            System.out.print(w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase());
        }


        /*
        String str = "cats AND*Dogs-are Awesome";

        for (String w : str.split("[^a-zA-Z]")) {
            System.out.print(w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase());
        }
*/

        /*
        input  ==> "cats AND*Dogs-are Awesome"
        output ==> "CatsAndDogsAreAwesome
         */

        System.out.println("\n***********************1204**************************");

        String input = "cats AND*Dogs-are Awesome";
        String[] arr4 = input.split("[^a-zA-Z]");
        System.out.println();
        System.out.println(Arrays.toString(arr4));               //[cats, AND, Dogs, are, Awesome]


        String data = "";
        for (String w : arr4) {
            data += w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase();
        }
        System.out.print(data);
/*
        System.out.println("\n***********************12044**************************");

        Arrays.stream(arr4).
                map(t -> t.toUpperCase().
                        substring(0, 1) + t.substring(1).
                        toLowerCase()).forEach(t -> System.out.print(t + " "));*/

    }
}
