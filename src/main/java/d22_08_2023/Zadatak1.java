package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
//        Unesite vrednost: 20
//        Unesite vrednost: 50
//        Unesite vrednost: 50
//        Prekoracenje! Kraj programa. Sracunata suma je 70.


        Scanner s = new Scanner(System.in);

        int endValue = 0;
        int value = 0;
        boolean stop = false;


        while (!stop){
            System.out.println("Unesite vednost: ");
            int numb = s.nextInt();
            value = value + numb;
            if (value > 100){

                stop = true;
            }
            endValue = value - numb ;


        }

        System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + endValue + ".");


    }
}
