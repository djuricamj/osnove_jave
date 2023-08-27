package d25_08_2023;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        int newNumber = getNewValue(4,6);
        System.out.println(newNumber);


    }

    public static int getNewValue ( int a, int b){

        int x = a * 10 + b  ;
        return x;





    }
}
