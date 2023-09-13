package d11_09_2023;

public class Knjiga {

    private int isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autorKnjige;

    public Knjiga (){
    }
    public Knjiga (int isbn, String naziv, int godinaIzdanja, Autor autorKnjige){
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autorKnjige = autorKnjige;
    }
    public void print (){
        System.out.println("ISBN: " + this.isbn);
        System.out.println(this.naziv + " - " + this.godinaIzdanja + ".");
        System.out.println("Autor: " + this.autorKnjige.getIme() + " " + this.autorKnjige.getPrezime());
    }
    public int getIsbn (){
        return this.isbn;
    }
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
    public String getNaziv(){
        return this.naziv;
    }
    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public int getGodinaIzdanja(){
        return this.godinaIzdanja;
    }
    public void setGodinaIzdanja(int godinaIzdanja){
        this.godinaIzdanja =godinaIzdanja;
    }
    public Autor getAutorKnjige(){
        return this.autorKnjige;
    }
    public void setAutorKnjige (Autor autorKnjige){
        this.autorKnjige = autorKnjige;
    }
}
