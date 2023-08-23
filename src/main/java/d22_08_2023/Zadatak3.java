package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..

        Scanner s = new Scanner(System.in);

            String I = "I";
            String v = "V";
            String x = "X";
            String l = "L";
            String c = "C";
            String D = "D";
            String m = "M";

            String arap1 = "1";
            String arap5 = "5";
            String arap10 = "10";
            String arap50 = "50";
            String arap100 = "100";
            String arap500 = "500";
            String arap1000 = "1000";
            boolean stop = false;

            while (!stop){

                System.out.print("Unesite rimski broj: ");
                String rim = s.next();

                if (rim.equals(I)){
                    System.out.println("Arapski: " + arap1);
                } else if (rim.equals(v)) {
                    System.out.println("Arapski: " + arap5);
                } else if (rim.equals(x)) {
                    System.out.println("Arapski: " + arap10);
                } else if (rim.equals(l)) {
                    System.out.println("Arapski: " + arap50);
                }else if (rim.equals(c)){
                    System.out.println("Arapski: " + arap100);
                } else if (rim.equals(D)) {
                    System.out.println("Arapski: " + arap500);
                }else if (rim.equals(m)){
                    System.out.println("Arapski: " + arap1000);
                } else if (rim.equals("KRAJ")) {
                    stop = true;
                }

            }
        System.out.println("Kraj programa.");





    }
}
