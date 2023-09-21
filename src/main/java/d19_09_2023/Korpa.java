package d19_09_2023;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> ambalaze;

    public Korpa() {
        this.ambalaze = new ArrayList<>();
    }
    public void dodajAmbalazu (Ambalaza novaAmbalaza){
        this.ambalaze.add(novaAmbalaza);
    }
    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if (this.ambalaze.get(i).barkord.equals(barkod)){
                this.ambalaze.remove(this.ambalaze.get(i));
            }
        }
    }
    private double ambalazeSaPopustom (double popust){
        double cenaSaPopustom = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            cenaSaPopustom = cenaSaPopustom + this.ambalaze.get(i).cena() - popust;
        }
        return cenaSaPopustom;
    }
    public double ukupnaCenaKorpe (SuperKArtica superKartica){
       double popust = superKartica.getPopust();
       double suma = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            suma = suma + this.ambalaze.get(i).cena() ;

        }
        return suma - popust;
    }

}
