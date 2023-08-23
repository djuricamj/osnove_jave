package d22_08_2023;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//
//        Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//        Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//                Primer izvrsenja:
//        Unos: (
//                Unos: 2
//        Unos: *
//        Unos: (
//                Unos: 1
//        Unos: +
//                Unos: 3
//        Unos: )
//        Unos: )
//        Unos: =
//        Zagrade su uparene
//                (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)

        Scanner s = new Scanner(System.in);

        int countOB = 0;
        int countCB = 0;
        boolean stop = false;

        while (!stop){

            System.out.print("Unos: ");
            String input = s.next();

            if (input.equals("(")){
                countOB++;
            }
            if (input.equals(")")){
                countCB++;
            }

            if (input.equals("=")){
                stop = true;
            }



        }
        if (countOB == countCB){
            System.out.println("Zagrade su uparene.");
        }else System.out.println("Zagrade nisu uparene.");








    }
}
