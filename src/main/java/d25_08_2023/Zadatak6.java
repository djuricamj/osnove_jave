package d25_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//    Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1


        Scanner s = new Scanner(System.in);

        System.out.print("Unesite M: ");
        int m = s.nextInt();
        System.out.print("Unesite N: ");
        int n = s.nextInt();
        numbers(m, n);

    }

    public static void numbers(int m, int n) {

        int count = 0;



        for (int i = m ; i < n - 1; i++) {
            count++;

        }
        System.out.println("Izmedju " + m + " i " + n +  " ima " + count + " broja");

    }
}

