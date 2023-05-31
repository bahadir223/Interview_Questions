package day45;

import java.util.Scanner;

public class C06 {
    // INTERVIEW QUESTIONS

    /*
             A                      2 space + ch+ 2 space
            A A                     1 space + ch + 1 space + ch + 1 space
           A A A                    1 ch + 1 space + 1 ch + 1 space + 1 ch
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter veriniz.");
        char ch = input.next().charAt(0);
        System.out.println("  " + ch + "  ");
        System.out.println(" " + ch + " " + ch + " ");
        System.out.println(ch + " " + ch + " " + ch);
    }
}
