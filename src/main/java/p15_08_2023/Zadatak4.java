package p15_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji na ekranu stampa podatke u formatu:
//        Sifra [SIFRA PROIZVODA]
//[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//[BOJA], [VELICINA]
//
//        Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//                Primer izvrsenja:
//        Sifra x932k20
//        Nike Patike - $90 - Popust 13.5%
//                Crna, 46.5

 String sifraProizvoda = "x932k29";
 String nazivProizvoda = "Nike Patike";
 int cena= 90;
 double popust= 13.5;
 String boja= "crna";
 double velicina = 39;

        System.out.println( sifraProizvoda);
        System.out.println(nazivProizvoda + " - $" + cena + " - " + popust + "%" );
        System.out.println(boja + ", " + velicina);


    }
}
