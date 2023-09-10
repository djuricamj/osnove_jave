package d07_09_2023;

public class AutomobilZadata {
    public static void main(String[] args) {

        Automobil autoOne = new Automobil();

        autoOne.marka = "Fiat";
        autoOne.model = "Albea";
        autoOne.godinaProizvodnje = 2004;


        Automobil autoTwo = new Automobil();

        autoTwo.marka = "Ford";
        autoTwo.model = "Focus";
        autoTwo.godinaProizvodnje = 2005;

        Automobil autoThree = new Automobil();

        autoThree.model = "Citroen";
        autoThree.marka = "C2";
        autoThree.godinaProizvodnje = 2003;

        System.out.println("Automobili u ponudi: ");
        System.out.println();
        System.out.println(autoOne.marka + " " + autoOne.model + " proizveden " + autoOne.godinaProizvodnje );
        System.out.println();
        System.out.println(autoTwo.marka + " " + autoTwo.model + " proizveden " + autoTwo.godinaProizvodnje );
        System.out.println();
        System.out.println(autoThree.marka + " " + autoThree.model + " proizveden " + autoThree.godinaProizvodnje );

    }
}
