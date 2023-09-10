package d07_09_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FilmZadatak {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Tri omiljena filma");
        System.out.println();


        Film filmOne = new Film();

        System.out.println("Unesite informacije za prvi film: ");

        System.out.print("Naziv filma: ");
        filmOne.naziv = s.next();

        System.out.print("Godina izdanja: ");
        filmOne.godinaIzdana = s.nextInt();

        System.out.print("Reziser: ");
        filmOne.reziser = s.next();

        System.out.println("Unete unformacije za prvi film su : ");
        System.out.println();
        System.out.println("Naziv filma: " + filmOne.naziv);
        System.out.println("Godina izdanja: " + filmOne.godinaIzdana);
        System.out.println("Reziser: " + filmOne.reziser);
        System.out.println();

        Film filmTwo = new Film();

        System.out.println("Unesite informacije za drugi film: ");

        System.out.print("Naziv filma: ");
        filmTwo.naziv = s.next();

        System.out.print("Godina izdanja: ");
        filmTwo.godinaIzdana = s.nextInt();

        System.out.print("Reziser: ");
        filmTwo.reziser = s.next();

        System.out.println("Unete unformacije za drugi film su : ");
        System.out.println();
        System.out.println("Naziv filma: " + filmTwo.naziv);
        System.out.println("Godina izdanja: " + filmTwo.godinaIzdana);
        System.out.println("Reziser: " + filmTwo.reziser);
        System.out.println();

        Film filmThree = new Film();

        System.out.println("Unesite informacije za treci film: ");

        System.out.print("Naziv filma: ");
        filmThree.naziv = s.next();

        System.out.print("Godina izdanja: ");
        filmThree.godinaIzdana = s.nextInt();

        System.out.print("Reziser: ");
        filmThree.reziser = s.next();

        System.out.println("Unete unformacije za treci film su : ");
        System.out.println();
        System.out.println("Naziv filma: " + filmThree.naziv);
        System.out.println("Godina izdanja: " + filmThree.godinaIzdana);
        System.out.println("Reziser: " + filmThree.reziser);


    }

}
