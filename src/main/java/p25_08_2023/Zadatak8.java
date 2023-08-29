package p25_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {

//        Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).
//1 - I
//2 - II
//3 - III
//4 - IV
//5 - V
//Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.

        int x = getNumber("III");
        System.out.println(x);

        int y = getNumber("V");
        System.out.println(y);

        String str = "dzambilon";
        if(str.equals("dzambilo")){ 

            System.out.println("da");
        }else System.out.println("ne");


    }

    public static int getNumber(String rimski) {
        int arapski = 0;

        if (rimski.equals("I")) {
           arapski =  1;
        } else if (rimski.equals("II")) {
            arapski =  2;
        } else if (rimski.equals("III")) {
            arapski =  3;
        } else if (rimski.equals("IV")) {
            arapski = 4;
        } else if (rimski.equals("V")) {
            arapski  = 5;
        }
        return arapski;
    }


}
