package d12_09_2023;

public class Racun {
    private String brRacuna;
    private String  punoIme;
    private double trenutnoStanje;



    public Racun(String brRacuna, String punoIme, double trenutnoStanje) {
        this.brRacuna = brRacuna;
        this.punoIme = punoIme;
        this.trenutnoStanje = trenutnoStanje;
    }

    public void uplatiNaRacun (double uplata){
         this.trenutnoStanje = this.trenutnoStanje + uplata;
     }
     public void skiniSaRacuna (double isplata){
            this.trenutnoStanje = this.trenutnoStanje - isplata;

     }
     public void stampa (){
         System.out.println(this.punoIme + " - " + this.brRacuna);
         System.out.println("Stanje na racunu je " + this.trenutnoStanje + "rsd");
     }

    public String getBrRacuna() {
        return brRacuna;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }


}
