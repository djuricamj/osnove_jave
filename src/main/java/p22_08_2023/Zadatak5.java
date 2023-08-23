package p22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati program koji simulira ponasanje jednog test case-a. Test case ima 5 provera, a program validira jednu po jednu proveru sve dok ne proveri sve ili dok neka provera ne failuje. Korisnik sa tastature za svaku proveru unosi expected rec i actual rec. U slucaju fail-a ispisati odgovarajucu poruku.


                Scanner s = new Scanner(System.in);
                String expected = "";
                String actual = "";
                boolean res = false;
                int obrt = 0;
                int stop = 0;

                while (!res|| stop == 0){
                    System.out.println("Unesite expected: ");
                    expected = s.next();
                    System.out.println("Unesite actual: ");
                    actual = s.next();

                    if (actual.equals(expected)){
                        obrt++;
                    } else
                        System.out.println("Test failed: Expected "+ expected + " but got " + actual);{
                        ;
                    }

                    if  (obrt == 5); {
                        System.out.println("Test passed.");
                        stop = 1;
                    }





                }


    }
}
