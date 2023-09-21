package d19_09_2023;

public class SuperKArtica {
    private String brojKartice;
    private String punoImeVlasnika;
    private double popust;

    public SuperKArtica() {
    }

    public SuperKArtica(String brojKartice, String punoImeVlasnika, double popust) {
        this.brojKartice = brojKartice;
        this.punoImeVlasnika = punoImeVlasnika;
        this.popust = popust;
    }
    public void stampaj (){
        System.out.println("Broj kartice: " + this.brojKartice + ", Ime i prezime: " + this.punoImeVlasnika);
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getPunoImeVlasnika() {
        return punoImeVlasnika;
    }

    public void setPunoImeVlasnika(String punoImeVlasnika) {
        this.punoImeVlasnika = punoImeVlasnika;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }
}
