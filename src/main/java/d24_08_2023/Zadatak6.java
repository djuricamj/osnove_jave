package d24_08_2023;

import java.util.ArrayList;

public class Zadatak6 {
    public static void main(String[] args) {

//        Napisati program koji vrsi proveru linkova sa stranice. Program cuva 3 niza:
//niz linkova
//niz ocekivanih status kodova za linkove iz prvog niza (expected status codes)
//niz status kodova koje vracaju linkovi iz prvog niza (actual status codes)
//
//	Nizovi potrebni za ovaj primer:
//linkovi
//https://cms.demo.katalon.com/cart/
//https://cms.demo.katalon.com/shop/
//https://cms.demo.katalon.com/account/
//https://cms.demo.katalon.com/cart/
//https://cms.demo.katalon.com/test/
//expected status codes
//200
//200
//404
//204
//200
//actual status codes
//200
//200
//400
//200
//404
//Program za svaki link vrsi proveru ocekivane i dobijene vrednosti za status kod. Ukoliko se actual i expected vrednosti ne poklapaju ispisati gresku u formatu:
//Assertion Error: Link <link> expected status code <expected code> but got <actual code>
//Primer izvrsenja:
//Assertion Error: https://cms.demo.katalon.com/account/ expected 404 but got 400
//Assertion Error: https://cms.demo.katalon.com/cart/ expected 204 but got 200
//Assertion Error: https://cms.demo.katalon.com/test/ expected 200 but got 404


        ArrayList<String> link = new ArrayList<>();

        link.add("https://cms.demo.katalon.com/cart/");
        link.add("https://cms.demo.katalon.com/shop/");
        link.add("https://cms.demo.katalon.com/account/");
        link.add("https://cms.demo.katalon.com/cart/");
        link.add("https://cms.demo.katalon.com/test/");


        ArrayList<Integer> codeE = new ArrayList<>();

        codeE.add(200);
        codeE.add(200);
        codeE.add(404);
        codeE.add(204);
        codeE.add(200);


        ArrayList<Integer> codeA = new ArrayList<>();

        codeA.add(200);
        codeA.add(200);
        codeA.add(400);
        codeA.add(200);
        codeA.add(404);

        int x = 0;
        int y = 1;
        String link1 = "";



        for (int i = 0; i < codeE.size(); i++) {
             x = codeE.get(i);
             y = codeA.get(i);
            link1 = link.get(i);

            if (x != y ) {
                System.out.println("Assertion Error: Link " + link1 +  " expected status code " + x + " but got " + y);

            }
        }




    }





}
