package p21_08_2023;

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");

        int N = s.nextInt();
        int parni = 0;



        for (int i = 1; i <= N; i++) {

            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (broj % 2 == 0) {
                parni = parni + 1;

                    }



        }

        System.out.println("Uneto je " + parni + " parna broja.");
    }
}
