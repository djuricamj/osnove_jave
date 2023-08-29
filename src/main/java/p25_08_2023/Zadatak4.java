package p25_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.

        print(1,1);
        System.out.println();
        print(2,3);
        System.out.println();
        print(8,2);

    }

    public static void print (int number1, int number2){
      int suma = number1 + number2;
      int proizvod = number1 * number2;
      int kolicnik = number1 / number2;
      int oduzimanje = number1 - number2;

        System.out.println("Suma: " + suma);
        System.out.println("Proizvod: " + proizvod);
        System.out.println("Kolicnik: " + kolicnik);
        System.out.println("Oduzimanje: " + oduzimanje);
    }
}
