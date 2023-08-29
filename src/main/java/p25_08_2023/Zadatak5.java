package p25_08_2023;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

//        Napisati metodu koja stampa N zvezdica u istom redu, na kraju reda stampa novi red.. Broj zvezdica je odredjen parametrom N.
//        Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//        N=5, print je=> * * * * *
//
//        Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//        N=9, print je=> * * * * * * * * *
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite M: ");
        int m = s.nextInt();


        for (int i = 1; i <= m; i++) {
            printStar(i);



        }

    }

    public static void printStar(int n){
        for (int i = 0; i < n; i++) {

            String star = "* ";

            System.out.print(star);

        }
        System.out.println("" +
                "");





    }

}
