package d08_09_2023;

public class ProizvodZadatak {
    public static void main(String[] args) {


        Proizvod proizvodOne = new Proizvod();

        proizvodOne.naziv = "Brasno";
        proizvodOne.cena = 109.99;
        proizvodOne.tezinaUGr = 1000;

        proizvodOne.stampaj();

        Proizvod proizvodTwo = new Proizvod();

        proizvodTwo.naziv = "Secer";
        proizvodTwo.cena = 89.99;
        proizvodTwo.tezinaUGr = 1000;

        proizvodTwo.stampaj();



        proizvodOne.povecajCenu(10);
        proizvodTwo.povecajCenu(25);
        System.out.println("Nova cena za proizvod " + proizvodOne.naziv + " je : " + proizvodOne.cena);
        System.out.println("Nova cena za proizvod " + proizvodTwo.naziv + " je : " + proizvodTwo.cena);
        System.out.println();


        proizvodOne.cenaSaPopustom = proizvodOne.vratiCenuSaPopustom(30);
        System.out.println("Ukoliko je popust odobren, cena za " + proizvodOne.naziv + " ce biti " + proizvodOne.cenaSaPopustom + " din.");

        proizvodTwo.cenaSaPopustom = proizvodTwo.vratiCenuSaPopustom(30);
        System.out.println("Ukoliko je popust odobren, cena za " + proizvodTwo.naziv + " ce biti " + proizvodTwo.cenaSaPopustom + " din.");
        System.out.println();

        proizvodOne.postarina = proizvodOne.racunajPostarinu();
        proizvodTwo.postarina = proizvodTwo.racunajPostarinu();
        System.out.println("Postarina za " + proizvodOne.naziv + " je " + proizvodOne.postarina + " din.");
        System.out.println("Postarina za " + proizvodTwo.naziv
                + " je " + proizvodTwo.postarina + " din.");
    }
}
