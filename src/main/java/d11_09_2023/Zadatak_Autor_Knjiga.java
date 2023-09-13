package d11_09_2023;

public class Zadatak_Autor_Knjiga {
    public static void main(String[] args) {

        Autor autorOne = new Autor("Herman","Melville" );
        Autor autorTwo = new Autor("Leo", "Tolstoy" );
        Autor autorThree = new Autor("William ", "Shakespeare");
        Knjiga knjigaOne = new Knjiga(123,"Moby Dick", 1851,autorOne);
        Knjiga knjigaTwo = new Knjiga(213,"War and Peace",1865,autorTwo );
        Knjiga knjigaThree = new Knjiga(321, "Hamlet ", 1599, autorThree );
        knjigaOne.print();
        System.out.println();
        knjigaTwo.print();
        System.out.println();
        knjigaThree.print();

    }
}
