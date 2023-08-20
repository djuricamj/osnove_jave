package d18_08_2023;

public class Zadatak5 {
    public static void main(String[] args) {
//
//        Napisati program koji stampa sve brojeve od 1 do 100 tako da:
//        sve parne stampa kao negativne
//        sve neprane kao pozitivne brojeve
//        Primer izvrssenja:
//
//        0, 1, -2, 3, -4, 5, -6, ……..
        int i = 0;
        for (i = 0; i < 100; i++) {
            if (i%2 == 0){
                System.out.print(i*(-1) + ", ");

            }else System.out.print(i + ", ");

        }

        System.out.print(i*(-1));
    }

// Ovako sam radila samo jer zadatak kaze da iamo 100 brojeva,a htela sam da skinem zarez posle 100. Da je drugacije postavljen tj da imamo n brojeva, drugacije bih ga urtadila

}
