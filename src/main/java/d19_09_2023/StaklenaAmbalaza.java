package d19_09_2023;

public class StaklenaAmbalaza  extends Ambalaza{
    private double iznosKaucije;
    private boolean kaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkord, String naziv, double netoTezina, double brutoTezina, double iznosKaucije, boolean kaucija, double osnovnaCena) {
        super(barkord, naziv, netoTezina, brutoTezina);
        this.iznosKaucije = iznosKaucije;
        this.kaucija = kaucija;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        double cena = 0;
        if (kaucija){
            cena= this.osnovnaCena * 1.2 + this.iznosKaucije;
        }else cena = osnovnaCena * 1.2;
        return cena;
    }
    public void stampaj (){
        if (this.kaucija){
            System.out.println("Osnovna cena proizvoda " + this.naziv + " je " + this.osnovnaCena + "din, ali posto se za ambalazu placa kaucija, nova cena je " + this.cena() + "din." );
        }else System.out.println("S obzirom da se za proizvod " + this.naziv + " ne placa kaucija, cena proizvoda je " + this.cena() + "din");
        System.out.println("Dodatne informacije o proizvodu su: ");
        System.out.println("Neto tezina: " + this.netoTezina + "; Bruto tezina " + this.brutoTezina + "; Barkod proizvoda: " + this.barkord);

    }


    public double getIznosKaucije() {
        return iznosKaucije;
    }

    public void setIznosKaucije(double iznosKaucije) {
        iznosKaucije = iznosKaucije;
    }

    public boolean isKaucija() {
        return kaucija;
    }

    public void setKaucija(boolean kaucija) {
        this.kaucija = kaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
}
