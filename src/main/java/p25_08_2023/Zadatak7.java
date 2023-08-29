package p25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {

//        7. Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla. Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c




            boolean x = getTriangle(3,4,5 );

        System.out.println(x);
    }
    public static boolean getTriangle (int a, int b, int c){
        if ((a*a + b*b )== c*c){
            return true;
        }else
            return false;

    }
}
