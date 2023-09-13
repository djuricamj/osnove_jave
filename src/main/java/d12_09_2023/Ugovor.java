package d12_09_2023;

public class Ugovor {
    private String datum;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private int cena;
    private String adresa;
//    private double zaradaAgencije;
//    private double procenatZarade;

    public Ugovor (String datum, FizickoLice prodavac, FizickoLice kupac, int cena, String adresa){
        this.datum = datum;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa = adresa;
    }

    public double procenatZarade () {
        if (this.kupac.getKupovina()) {
            return 0.02;
        } else {
            return 0.03;
        }
    }

    public double zaradaAgencije () {
        return  1000 + this.cena * this.procenatZarade();
    }

    public void print(){
        System.out.println("Dana " + this.datum + "godine skloplen je ugovor izmedju " +
                this.prodavac.getPunoIme() + " i " + this.kupac.getPunoIme() +
                " o kupovini nekretnine " + this.adresa + " po ceni od " + this.cena +
                "eur, pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + this.zaradaAgencije());
    }


}
