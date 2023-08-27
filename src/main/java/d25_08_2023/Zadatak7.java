package d25_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

//        Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
//
//Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int prvi = s.nextInt();
        System.out.print("Unesite drugi broj: ");
        int drugi = s.nextInt();
        System.out.print("Unesite treci broj: ");
        int treci = s.nextInt();

        int x = fja(prvi, drugi, treci);

        System.out.println("Najmanji broj je " + x);



    }
    public static int fja(int a, int b, int c){
        int min = a;
        if (b < min ){
            min = b;
        }else if (c < min){
            min = c;
        }
        return min;


    }
}
