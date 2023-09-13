package d12_09_2023;

public class FizickoLice {

    private String punoIme;
    private String licnaKarta;
    private  String  jmbg;
    private boolean kupovina;

    public FizickoLice ( String punoIme, String licnaKarta, String jmbg, boolean kupovina){
        this.punoIme = punoIme;
        this.licnaKarta = licnaKarta;
        this.jmbg = jmbg;
        this.kupovina = kupovina;
    }
    public void setPunoIme (String punoIme){
        this.punoIme = punoIme;
    }
    public String  getPunoIme (){
        return this.punoIme;
    }
    public void setLicnaKarta (String licnaKarta){
        this.licnaKarta = licnaKarta;
    }
    public String  getLicnaKarta (){
        return this.licnaKarta;
    }
    public String  getJmbg (){
        return this.jmbg;
    }

    public void setKupovina(boolean kupovina) {
        this.kupovina = kupovina;
    }

    public boolean getKupovina() {
        return kupovina;
    }
}
