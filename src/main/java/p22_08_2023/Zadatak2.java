package p22_08_2023;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//
//        Zadatak
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu dve nule.
//                Primer:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:1
//        Unesite broj:0
//        Kraj programa jer je uneto 2 nule.




                Scanner s = new Scanner(System.in);

        int broj = 1;
        int counter = 0;



        while (counter < 2){
            System.out.println("Unesite broj: ");
            broj = s.nextInt();

            if (broj == 0) {
                counter++;
            }




        }
        System.out.println("Kraj programa jer je uneto 2 nule");
    }
}
