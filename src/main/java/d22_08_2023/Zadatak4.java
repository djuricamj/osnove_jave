package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//                Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:2
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto dve dvojke)
//
//        Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:1
//        Unesite broj:3
//        Unesite broj:1
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto tri jedinice)

        Scanner s = new Scanner(System.in);
        int count2 = 0;
        int count1 = 0;
        boolean stop = false;


        while (!stop){

            System.out.print("Unesite broj: ");
            int numb = s.nextInt();

            if (numb == 2){
                count2++;

            } else if (numb == 1) {
                count1++;

            }
            if (count1 == 3 || count2 ==2){
                stop = true;
            }


        }

        System.out.println("Kraj programa.");


    }
}
