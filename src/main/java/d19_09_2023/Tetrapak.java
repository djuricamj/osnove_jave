package d19_09_2023;

import com.sun.source.tree.BreakTree;

public class Tetrapak extends Ambalaza{
    private boolean reciklaza;
    private double osnovnaCena;

    public Tetrapak(String barkord, String naziv, double netoTezina, double brutoTezina, boolean reciklaza, double osnovnaCena) {
        super(barkord, naziv, netoTezina, brutoTezina);
        this.reciklaza = reciklaza;
        this.osnovnaCena = osnovnaCena;
    }
    public double cena (){
        double cena = 0;
        if (this.reciklaza){
           cena = this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        }else cena = this.osnovnaCena;
        return cena;
    }


    public void stampaj (){
        if (this.reciklaza){
            System.out.println("Osnovna cena proizvoda " + this.naziv + " je " + this.osnovnaCena + "din, ali posto se proizvod reciklira nova cena je " + this.cena() + "din." );
        }else System.out.println("S obzirom da se proizvod " + this.naziv + " ne reciklira, cena proizvoda ostaje " + this.cena() + "din");
        System.out.println("Dodatne informacije o proizvodu su: ");
        System.out.println("Neto tezina: " + this.netoTezina + "; Bruto tezina " + this.brutoTezina + "; Barkod proizvoda: " + this.barkord);

    }

    public boolean isReciklaza() {
        return reciklaza;
    }

    public void setReciklaza(boolean reciklaza) {
        this.reciklaza = reciklaza;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
}
