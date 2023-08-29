package p25_08_2023;

public class Zadatak6 {
    public static void main(String[] args) {
// Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//Primer: Ako se metoda pozove za N=10, vraca -10
//	Ako se metoda pozove za N=-11, vraca 11

        int x = getNegative(8);

        System.out.println(x);

    }
    public static int getNegative (int n){


        return -1 * n;

    }
}
