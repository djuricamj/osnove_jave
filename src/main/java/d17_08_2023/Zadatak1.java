package d17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati program koji ima informacije koje ucitava informacije sa tastature:
//        Ime
//                Prezime
//        godinu rodjenja
//        I stampa informaicije u formatu:
//[ime] [prezime] - [startost] god
//
//        Primer izvrsenja:
//        Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
//        Milan Jovanovic - 26 god



        Scanner s = new Scanner(System.in);

        System.out.print("Unesi ime: ");
        String ime = s.next();

        System.out.print("Unesi prezime: ");
        String prezime = s.next();

        System.out.print("Unesi godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();

        int godinaTrenutna = 2023;

        int godine = godinaTrenutna - godinaRodjenja;

        System.out.println( ime + " " + prezime + " - " + godine);

    }
}
