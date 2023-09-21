package d19_09_2023;

public abstract class Ambalaza {
    protected  String barkord;
    protected String naziv;
    protected double netoTezina;
    protected double brutoTezina;

    public Ambalaza() {
    }

    public Ambalaza(String barkord, String naziv, double netoTezina, double brutoTezina) {
        this.barkord = barkord;
        this.naziv = naziv;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }
    public double tezinaPakovanja (){
        double tezina = this.brutoTezina - this.netoTezina;
        return tezina;
    }
    public abstract double cena();
    public abstract void stampaj();

    public String getBarkord() {
        return barkord;
    }

    public void setBarkord(String barkord) {
        this.barkord = barkord;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(double netoTezina) {
        this.netoTezina = netoTezina;
    }

    public double getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(double brutoTezina) {
        this.brutoTezina = brutoTezina;
    }
}
