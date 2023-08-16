package d15_08_2023;

public class Zadatak9 {
    public static void main(String[] args) {

//        Napisati program koji vrsi procentualnu procenu u fazi skidanja fajla. Program od informacija cuva naziv originalnog fajla, velicinu originalnog
//        fajla u Mb (megabajtima) i velicinu skunutog dela fajla takodje u Mb. Na kraju programa racuna i ispisuje koji je deo fajla skinut.Stampanje se
//        vrsi u formatu
//        naziv fajla velicina originalnog fajla Mb/velicina skinutog dela fajla Mb
//                *****************************
//***********procenat %
//*****************************
//        Primer izvrsenja:
//        profile-image.png 7Mb/2Mb
//                *****************************
//*********** 28%
//*****************************

        String nazivFajla ="img.png";
        double velicinaOreginalnogFajla = 7;
        double velicinaSkinutogDela = 2;

        double procenatSkinutogFajla = velicinaSkinutogDela / (velicinaOreginalnogFajla / 100);

        int zaokruzeno = (int)procenatSkinutogFajla;

        System.out.println(nazivFajla + " " + (int)velicinaOreginalnogFajla + "Mb/" + (int)velicinaSkinutogDela + "Mb");
        System.out.println("Procenat skinutog dela je: " + zaokruzeno + "%");


    }
}
