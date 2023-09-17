package d14_09_2023;

import p15_09_2023_.Osoba;
import p15_09_2023_.Profesor;

public class Ispit {

    private String nazivPredmeta;
    private int ocena;
    private String imeProfesora;

    public Ispit(String nazivPredmeta, int ocena, String imeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imeProfesora = imeProfesora;
    }
    public boolean polozen (){
        if (this.ocena > 5){
            return true;
        }
        return false;
    }
    public void stampa (){
        System.out.println(this.nazivPredmeta + " - " + this.imeProfesora + " - " + this.ocena);
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public static class Student extends Osoba {
        private int brIndeksa;
        private double dug;

        public Student(int brIndeksa, double dug) {
            this.brIndeksa = brIndeksa;
            this.dug = dug;
        }

        public Student(String punoIme, String jmbg, int brIndeksa, double dug) {
            super(punoIme, jmbg);
            this.brIndeksa = brIndeksa;
            this.dug = dug;
        }

        public Student (){
            super();
        }

        public void umanjiSkolarinu (int iznosUplate) {
            this.dug = this.dug - iznosUplate;

        }

    //    public void stampajStudenta (){
    //        System.out.println("Ime i prezime: " + this.punoIme + " | Broj indeksa: " + this.brIndeksa);
    //        System.out.println("JMBG: " + this.jmbg);
    //        System.out.println("Dug za placanje: " + this.dug);
    //    }

    //    @Override
    //    public void stampaj (){
    //        System.out.println("Ime i prezime: " + this.punoIme + " | Broj indeksa: " + this.brIndeksa);
    //        System.out.println("JMBG: " + this.jmbg);
    //        System.out.println("Dug za placanje: " + this.dug);
    //    }
        @Override
        public void stampaj (){
            super.stampaj();
            System.out.println("Dug za placanje: " + this.dug);

        }

        public int getBrIndeksa() {
            return brIndeksa;
        }

        public void setBrIndeksa(int brIndeksa) {
            this.brIndeksa = brIndeksa;
        }

        public double getDug() {
            return dug;
        }



    }

    public static class Zadatak1 {
        public static void main(String[] args) {


    //        Zadatak
    //		Kreirati klasu Osoba koja od atributa ima:
    // ime i prezime
    // jmbg
    //konstuktor sa parametrima
    //difoltni konstuktor
    //metodu stampaj koja stampa podatke u formatu
    //			ime prezime, jmbg
    //
    //
    //		Kreirati klasu Student koja nasledjuje klasu Osoba,
    //			koja od dodatnih atributa ima:
    //broj indeksa
    //dug za skolarinu
    //konstuktor sa parametrima
    //difoltni konstuktor
    //metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
    //Napisati metod stampajStudenta da stampa sve podatke o studentu
    //
    //
    //Kreirati klasu Profesor koja nasledjuje klasu Osoba,
    //			koja od dodatnih atributa ima:
    //naziv predmeta koji predaje
    //iznos plate
    //konstuktor sa parametrima
    //difoltni konstuktor
    //metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
    //Napisati metodu stampajProfu da stampa sve podatke o profesoru
    //
    //
    //		U glavnom programu kreirati 2 studenta i 2 profesora.




            Student s = new Student("Janko Jankovic", "6577483927463", 32,15000);
            Student e = new Student("Timea Timic", "6473748294657", 66, 3000);

            Profesor p = new Profesor("Ivan Todorovic", "6477328394758", "Matematika", 90000);
            Profesor g = new Profesor("Milorad Gojic", "6473747583948", "Engleski", 100000);

            s.umanjiSkolarinu(5000);
            p.povecajPlatu(5);
            s.stampaj();
            System.out.println();
            e.stampaj();
            System.out.println();
            p.stampaj();
            System.out.println();
            g.stampaj();
        }
    }
}

