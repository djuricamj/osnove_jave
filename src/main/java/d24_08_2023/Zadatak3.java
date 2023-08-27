package d24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
//Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

        ArrayList<Integer> niz = new ArrayList<>();

        niz.add(10);
        niz.add(20);
        niz.add(30);
        niz.add(40);
        niz.add(50);

        for (int i = niz.size() - 1; i >= 0; i--) {

            System.out.print(niz.get(i) + ", ");

        }


    }
}
