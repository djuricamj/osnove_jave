package d21_08_2023;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//        Program podrzava sledece reakcije:
//        like
//                smile
//        heart
//
//        Primer izvrsenja:
//        Unesite N: 7
//        Reaguj: like
//        Reaguj: heart
//        Reaguj: smile
//        Reaguj: lol
//        Reaguj: smile
//        Reaguj: like
//        Reaguj: like
//        Summary: like 3 | smile 2 | heart 1

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int likeBr = 0;
        int smileBr = 0;
        int heartBr = 0;


        for (int i = 0; i < n; i++) {

            System.out.print("Reaguj: ");
            String rec = s.next();

            if (rec.equals("like")) {
                likeBr++;
            } else if (rec.equals("smile")) {
                smileBr++;
            } else if (rec.equals("heart")) {
                heartBr++;
            }
        }

        System.out.println("Summary: " + "like " + likeBr + " | " + "smile " + smileBr + " | " + "heart " + heartBr);
    }
}
