package d15_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
//    1.Zadatak
//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.

    public static void main(String[] args) {
        Igrac igrac1Test = new Igrac("Stefan STefanovic", "6477328194637", 1995, 7, "odbrambeni", true);
        Igrac igrac2Test = new Igrac("Teodor Teodorovic", "6577322516354", 1996, 5, "odbrambeni", false);

        Trener trener1Test = new Trener("Nikola Nikolic", "7488293940573",1988, 6, "kondicioni trener");
        Trener trener2Test = new Trener("Nemanja Nemanjic", "2133425678923", 1989, 5, "pomocni trener");

        igrac1Test.stampaj();
        System.out.println();
        igrac2Test.stampaj();
        System.out.println();
        trener1Test.stampaj();
        System.out.println();
        trener2Test.stampaj();


        ArrayList<Igrac> igraci = new ArrayList<>();
        ArrayList<Trener> treneri = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        System.out.println("Koliko igraca zelite da dodate: ");
        int brIgraca = s.nextInt();

        for (int i = 0; i < brIgraca; i++) {

            System.out.print("Dodaj podatke o igracu: ");
            System.out.println();
            System.out.print("Ime i prezime: ");
            String punoIme = s.next();

            System.out.print("JMBG:");
            String jmbg = s.next();

            System.out.print("Godina rodjenja: ");
            int godinaRodjenja = s.nextInt();

            System.out.print("Broj na dresu: ");
            int broj = s.nextInt();

            System.out.print("Pozicija: ");
            String pozicija = s.next();

            System.out.print("da li je igrac kapiten: ");
            boolean kapiten = s.nextBoolean();

            Igrac igrac = new Igrac(punoIme,jmbg,godinaRodjenja,broj,pozicija,kapiten);
            igraci.add(igrac);
//

        }
        System.out.println("Koliko trenera zelite da dodate: ");
        int brTrenera = s.nextInt();

        for (int i = 0; i < brTrenera; i++) {

            System.out.print("Dodaj podatke o treneru: ");
            System.out.println();
            System.out.print("Ime i prezime: ");
            String punoIme = s.next();

            System.out.print("JMBG:");
            String jmbg = s.next();

            System.out.print("Godina rodjenja: ");
            int godinaRodjenja = s.nextInt();

            System.out.print("Godine iskustva: ");
            int iskustvo = s.nextInt();

            System.out.print("Tip trenera:  ");
            String tip = s.next();

            Trener trener = new Trener(punoIme, jmbg, godinaRodjenja, iskustvo, tip);
            treneri.add(trener);

        }

        for (int i = 0; i < igraci.size(); i++) {

            igraci.get(i).stampaj();
        }
        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();
        }















    }









}

