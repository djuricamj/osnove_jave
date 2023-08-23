package p22_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//        Zadatak
//        Napisati program koji radi bipovanje ruznih reci. Program radi za jednu recenicu, sto znaci da ucitava od korisnika rec po rec sve dok se ne unese rec sa tackom. Za reci koje su nepristojne ispisuje beeeeeeeeeeeeep.
//                Ruzne reci koje program prepoznaje su:
//        zajebava
//                mars
//        stoko
//                svinjo

        Scanner s = new Scanner(System.in);

        String zajebava = "zajebava";
        String mars = "mars";
        String stoko = "stoko";
        String svinjo = "svinjo";
        boolean stop = false;

        while (!stop){
            System.out.println("Unesite rec: ");
            String rec = s.next();


            if (rec.contains("zajebava") || rec.contains("mars") || rec.contains("stoko") || rec
                    .contains("svinjo")) {
                System.out.println("beeeeeeeeeeeep");

            }else System.out.println(rec);

            if (rec.contains("."))
                stop = true;




        }
        System.out.println("Kraj programa");


    }

}
