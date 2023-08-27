package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//     Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//Primer:
//Unesite pozicjiu od 0 do 9: 3
//Unesite novu vrednost: 11
//Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> numb = new ArrayList<>();

        numb.add(10);
        numb.add(20);
        numb.add(30);
        numb.add(40);
        numb.add(50);
        numb.add(60);
        numb.add(70);
        numb.add(80);
        numb.add(90);
        numb.add(100);

        System.out.print("Unesite poziciju od 0 do 9: ");
        int k = s.nextInt();
        System.out.print("Unesite novu vrednost: ");
        int vrednost = s.nextInt();

        numb.set(k, vrednost);










    }
}
