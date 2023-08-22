package d21_08_2023;

import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//        (Za vezbanje) Napisati program za ucenje matematike. Program daje korisniku 5 matematickih zadataka.
//        Svaki nivo predstavlja jednu iteraciju petlje i u svakom nivou korisniku se prikazuju dva random broja koja treba da sabere i poruka o tacnosti resenja. (Program generise random brojeve u opsegu od 0 do 50, ne unosi ih korisnik)
//        Random brojevi u Javi se generisisu kao u primeru
//// creating an object of Random class
//        Random random = new Random();
//// Generates random integers 0 to 49
//        int x = random.nextInt(50);
//        Koristan link, koristan video

        Scanner s = new Scanner(System.in);




        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int x = random.nextInt(50);
            int y = random.nextInt(50);
            int zbir = x + y;

            System.out.print("Koliko je " + x + "+" + y + " = " );
            int resenje = s.nextInt();
            if (zbir == resenje){
                System.out.println("Cestitam!");

            }else System.out.println("Greska!");
        }





    }
}
