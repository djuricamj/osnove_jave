package Zadaci_za_vezbanje;

import java.util.ArrayList;

public class Igrac extends Osoba{
    private int broj;
    private String pozicija;
    private ArrayList<Karton> kartoni;
    private boolean kapiten;

    public Igrac() {
        super();
    }

    public Igrac(String punoIme, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(punoIme, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
        this.kartoni = new ArrayList<>();
    }
    public void dodajKarton (Karton karton){

        this.kartoni.add(karton);
    }

    public int zutiKartoni (){
        int countZuti = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (this.kartoni.get(i).equals("zuti")){
                countZuti ++;
            }
        }
        return countZuti;
    }
    public int crveniKartoni (){
        int countCrveni = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (this.kartoni.get(i).equals("crveni")){
                countCrveni ++;
            }
        }
        return countCrveni;
    }
    @Override
    public void stampaj (){
        super.stampaj();
        System.out.println("Igrac nosi  broj " + this.broj + " na dresu i on je " + this.pozicija + ".");
        if (this.kapiten){
            System.out.println("Igrac je kapiten.");
        }

    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
}
