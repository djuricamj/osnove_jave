package Zadaci_za_vezbanje;

public class Zadatak1 {
    public static void main(String[] args) {


        Igrac igracA = new Igrac("Tima Timovic", "74754759395", 1997, 8, "napadac", false);
        Igrac igracB = new Igrac("Sima Simovic", "7539309575903", 1998, 7, "centar", false);
        Igrac igracC = new Igrac("Kima Kimovic", "758393754393", 1996, 9, "napadac", true);

        Karton a = new Karton("cveni");
        Karton b = new Karton("zuti");

        igracA.dodajKarton(a);
        igracA.dodajKarton(a);
        igracA.dodajKarton(a);
        igracA.dodajKarton(b);
        igracA.dodajKarton(a);
        igracA.dodajKarton(b);

        igracB.dodajKarton(a);
        igracB.dodajKarton(a);
        igracB.dodajKarton(a);
        igracB.dodajKarton(b);
        igracB.dodajKarton(a);
        igracB.dodajKarton(b);

        igracC.dodajKarton(a);
        igracC.dodajKarton(a);
        igracC.dodajKarton(a);
        igracC.dodajKarton(b);
        igracC.dodajKarton(a);
        igracC.dodajKarton(b);

        igracA.stampaj();
        System.out.println();
        igracC.stampaj();
        System.out.println();
        igracB.stampaj();
    }

}
