package d12_09_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

//        Zadatak
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo za polozene ispite


        ZeleniKarton a = new ZeleniKarton("Sofija Jovovic" , 32, "Matematika", "Milorad Boskovic", 7);
        ZeleniKarton b = new ZeleniKarton("Jovan Todorovic", 64, "Osnove programiranja", "Stanislav Ivkovic", 8);
        ZeleniKarton c = new ZeleniKarton("Janko Katic", 77, "Matematika" , "Milorad Boskovic" , 5);
        ZeleniKarton d = new ZeleniKarton("Tanja Saric", 12, "Osnove programiranja", "Stanislav Ivkovic", 10);
        ZeleniKarton e = new ZeleniKarton("Ivona Kalinic", 33, "Matematika" , "Milorad Boskovic", 5);


        ArrayList<ZeleniKarton> m = new ArrayList<>();
        m.add(a);
        m.add(b);
        m.add(c);
        m.add(d);
        m.add(e);



        for (int i = 0; i < m.size(); i++) {
            m.get(i).stampaj();
            System.out.println();

        }




        double prosecnaOcena = (a.getOcena() + b.getOcena() + c.getOcena() + d.getOcena() + e.getOcena()) / 5;
        System.out.println("Prosecna ocena za sve ispite je: " + prosecnaOcena);

        double countPolozene = 0;
        double suma = 0;

        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getOcena() > 5) {
                countPolozene++;
                suma = suma + m.get(i).getOcena();

            }
        }
        double prosecnaOcenaPolozenih = suma/countPolozene;
        System.out.println("Prosekcna ocena polozenih ispita je " + prosecnaOcenaPolozenih);




    }

}
