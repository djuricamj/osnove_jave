package d19_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Ambalaza mleko = new Tetrapak("6487-7458-7548", "Mleko", 70,90,true,70);
        Ambalaza jogurt = new Tetrapak("4647-34780-833", "Jogurt",90, 120,false,75);
        Ambalaza kiselaVoda = new StaklenaAmbalaza("65447-73723-2", "Kisela voda",89,150,25,true,55);

        Korpa korpa = new Korpa();
        korpa.dodajAmbalazu(mleko);
        korpa.dodajAmbalazu(jogurt);
        korpa.dodajAmbalazu(kiselaVoda);

        SuperKArtica superKartica= new SuperKArtica("123456", "Niko Nikic", 35);

        korpa.izbaciAmbalazu("6487-7458-7548");

     System.out.println("Ukupna cena sa popustom: " + korpa.ukupnaCenaKorpe(superKartica));


        }
    }
}
