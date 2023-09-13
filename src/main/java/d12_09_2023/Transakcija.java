package d12_09_2023;

public class Transakcija {
    private int id;
    private Racun salje;
    private Racun prima;

    public Transakcija(int id, Racun salje, Racun prima) {
        this.id = id;
        this.salje = salje;
        this.prima = prima;
    }

    public double provizija (double transakcija){
        if (transakcija <= 4500){
            return 45;
        }else return transakcija * 0.01;
    }
    public void izvrsiTransakciju (double transakcija) {

        if (this.salje.getTrenutnoStanje() + this.provizija(transakcija) > transakcija) {

            this.salje.skiniSaRacuna(transakcija);
            this.salje.skiniSaRacuna(this.provizija(transakcija));
            this.prima.uplatiNaRacun(transakcija);
        }
    }
    public void stampa (){
        System.out.println(this.id);
        System.out.println(this.salje.getPunoIme() + " - " + this.salje.getBrRacuna());
        System.out.println(this.prima.getPunoIme() + " - " + this.prima.getBrRacuna());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Racun getSalje() {
        return salje;
    }

    public void setSalje(Racun salje) {
        this.salje = salje;
    }

    public Racun getPrima() {
        return prima;
    }

    public void setPrima(Racun prima) {
        this.prima = prima;
    }
}
