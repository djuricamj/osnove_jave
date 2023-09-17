package d15_09_2023;

import java.util.ArrayList;

public class Igrac extends Osoba {
    private int broj;
    private String pozicija;
    private boolean kapiten;

    public Igrac (String punoIme, String jmbg, int broj, String pozicija, boolean kapiten){
        super();
    }

    public Igrac(String punoIme, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(punoIme, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

//    public void dodajIgraca (Igrac igraci){
//        this.igraci.add(igraci);
//    }


    @Override
    public void stampaj (){
        super.stampaj();
        System.out.println("Igrac nosi  broj " + this.broj + " na dresu i on je " + this.pozicija + " igrac.");
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
