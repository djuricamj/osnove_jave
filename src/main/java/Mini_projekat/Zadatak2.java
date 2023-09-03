package Mini_projekat;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

//**Zadatak: Simulacija iscrtavanja korisnika na Slacku**
//
//Napišite program koji simulira prikazivanje korisnika na Slacku. Prikaz korisnika treba da se izvede tako da prvo budu prikazani aktivni korisnici, a potom neaktivni. Program će čuvati sledeće informacije:
//Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
//Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan. Informacije o aktivnostima biće čuvane u nizu gde će za svakog korisnika biti zabeleženo da li je trenutno aktivan ili ne  (true ili false).. Naravno, korisnik i njegova aktivnost će biti upareni po istom indeksu. To znači da će se za korisnika na poziciji N u nizu "korisnici" čitati aktivnost sa pozicije N u nizu "aktivnosti".
//
//Program će ispisivati informacije za svakog korisnika na sledeći način:
//Za aktivne korisnike:
//  | slika |o Ime Prezime
//Za neaktivne korisnike:
//  | slika |x Ime Prezime

        ArrayList<String> user = new ArrayList<>();

        user.add("Pera Peric");
        user.add("Darko Darkovic");
        user.add("Marko Markovic");
        user.add("Stefan Stefanovic");
        user.add("Uros Urosevic");
        user.add("Milan Milovanovic");

        ArrayList<Boolean> activity = new ArrayList<>();

        activity.add(true);
        activity.add(false);
        activity.add(true);
        activity.add(true);
        activity.add(false);
        activity.add(true);

        for (int i = 0; i < user.size(); i++) {
            if (activity.get(i).equals(true)){
                System.out.println("| slika |o " + user.get(i));
            }

        }
        for (int i = 0; i < user.size(); i++) {
            if (activity.get(i).equals(false)) {
                System.out.println("| slika |x " + user.get(i));
            }

        }
    }
}
