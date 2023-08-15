package p15_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati program koji na ekranu stampa podatke u formatu:
//[IME I PREZIME]
//[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//[EMAIL]

        String ImeIPrezime = "Marijana Djurica";
        String brojTelefona = "12345679";
        String ulicaIBroj = "Voje Bogdanovic 30";
        String grad = "Veliko Gradiste";
        String email = "djuricamj@gmai.com";

        System.out.println(ImeIPrezime);
        System.out.println(brojTelefona + ", " + ulicaIBroj + ", " + grad);
        System.out.println(email);

    }
}
