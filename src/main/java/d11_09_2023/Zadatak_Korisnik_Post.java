package d11_09_2023;

public class Zadatak_Korisnik_Post {
    public static void main(String[] args) {
        Korisnik korisnik = new Korisnik("Pera", "Peric");

        FacebookPost post = new FacebookPost("Life is like a box of chocolates. You never know what you're gonna get. By Forrest Gump", korisnik);
        post.print();
    }

}
