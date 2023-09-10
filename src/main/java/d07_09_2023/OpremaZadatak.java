package d07_09_2023;

import java.util.Scanner;

public class OpremaZadatak {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Top tri brenda opreme za trening: ");
        System.out.println();

        Oprema opremaOne = new Oprema();

        System.out.println("Unesite informacije za No1: ");

        System.out.print("Tip opreme: ");
        opremaOne.tip = s.next();

        System.out.print("Marka: ");
        opremaOne.marka = s.next();

        System.out.print("Cena u dinarima: ");
        opremaOne.cena = s.nextDouble();
        System.out.println();




        Oprema opremaTwo = new Oprema();

        System.out.println("Unesite informacije za No2: ");

        System.out.print("Tip opreme: ");
        opremaTwo.tip = s.next();

        System.out.print("Marka: ");
        opremaTwo.marka = s.next();

        System.out.print("Cena u dinarima: ");
        opremaTwo.cena = s.nextDouble();
        System.out.println();




        Oprema opremaThree = new Oprema();

        System.out.println("Unesite informacije za No3: ");

        System.out.print("Tip opreme: ");
        opremaThree.tip = s.next();

        System.out.print("Marka: ");
        opremaThree.marka = s.next();

        System.out.print("Cena u dinarima: ");
        opremaThree.cena = s.nextDouble();
        System.out.println();



        System.out.println("No1 oprema je: " );
        System.out.println(opremaOne.tip + " marke " + opremaOne.marka );
        System.out.println("cena: " + opremaOne.cena);
        System.out.println();

        System.out.println("No2 oprema je: " );
        System.out.println(opremaTwo.tip + " marke " + opremaTwo.marka );
        System.out.println("cena: " + opremaTwo.cena);
        System.out.println();

        System.out.println("No3 oprema je: " );
        System.out.println(opremaThree.tip + " marke " + opremaThree.marka );
        System.out.println("cena: " + opremaThree.cena);








    }
}
