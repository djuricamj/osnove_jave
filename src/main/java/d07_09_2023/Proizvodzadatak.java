package d07_09_2023;

public class Proizvodzadatak {
    public static void main(String[] args) {

        Proivod proizvodOne = new Proivod();

        proizvodOne.naziv = "Jagode";
        proizvodOne.cena = 224.99;

        Proivod proizvodTwo = new Proivod();

        proizvodTwo.naziv = "Breskve";
        proizvodTwo.cena = 149.99;

        Proivod proizvodThree = new Proivod();

        proizvodThree.naziv = "Borovnice";
        proizvodThree.cena = 199.99;


        System.out.println("Akcijska cena voca je: ");
        System.out.println();
        System.out.println(proizvodOne.naziv + " - " + proizvodOne.cena + "din");
        System.out.println();
        System.out.println(proizvodTwo.naziv + " - " + proizvodTwo.cena + "din");
        System.out.println();
        System.out.println(proizvodThree.naziv + " - " + proizvodThree.cena + "din");
    }
}
