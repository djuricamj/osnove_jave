package p18_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

//        Ukoliko je jacina zvuka 0 stampa se slika </ (simulacija za mute) u sprotnom < | | | (sa brojem crtica jacinom zvuka)

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite jacinu zvuka: ");
        int jacinaZvuka = s.nextInt();


        if (jacinaZvuka == 0) {
            System.out.println("</");
        }
        System.out.print("<");

        for (int i = 0; i < jacinaZvuka; i++) {

            System.out.print("| ");
        }


    }
}
