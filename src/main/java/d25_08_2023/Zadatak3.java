package d25_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca;


        printInfo("2546547643", "Marijana", "Djurica", "1998", true);




    }
    public static void printInfo ( String jmbg, String ime, String prezime, String godinaRodjenja, boolean aktivnost){
        System.out.println( "JMBG: " + jmbg );
        System.out.println( "Ime: " + ime );
        System.out.println( "Prezime: " + prezime );
        System.out.println( "Godina rodjenja: " + godinaRodjenja );
        System.out.println( "Aktivan: " + aktivnost );

    }
}
