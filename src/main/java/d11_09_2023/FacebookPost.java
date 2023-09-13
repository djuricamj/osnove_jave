package d11_09_2023;

public class FacebookPost {

    private String opis;
    private  Korisnik kreator;
    public FacebookPost(){
    }
    public FacebookPost(String opis, Korisnik kreator){
    this.opis = opis;
    this.kreator = kreator;
    }
    public void print (){
        System.out.println(this.kreator.getIme() + " " + this.kreator.getPrezime());
        System.out.println(this.opis);
    }

    public String getOpis(){
        return this.opis;
    }
    public void setOpis(String opis){
        this.opis = opis;
    }
    public Korisnik getKreator(){
        return this.kreator;
    }
    public void setKreator(Korisnik kreator){
        this.kreator = kreator;
    }
}
