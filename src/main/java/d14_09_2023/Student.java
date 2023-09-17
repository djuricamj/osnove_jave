package d14_09_2023;

import d14_09_2023.Ispit;

import java.util.ArrayList;

public class Student {
    private int brIndeksa;
    private String punoIme;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public Student(int brIndeksa, String punoIme, String tipStudija) {
        this.brIndeksa = brIndeksa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }
    public void dodajIspit (Ispit noviIspit){
        this.ispiti.add(noviIspit);
    }
    public double prosekPolozenih (){
        double suma = 0;
        double count = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).polozen()){
                count ++;
                suma = suma + this.ispiti.get(i).getOcena();
            }
        }
        return suma / count;
    }

    public void stampa (){
        System.out.println(this.brIndeksa +  " - " + this.punoIme + " - " + this.tipStudija );
        for (int i = 0; i < this.ispiti.size(); i++) {
            this.ispiti.get(i).stampa();
        }
         System.out.println("PRosecna ocena polozenih ispita je: " + this.prosekPolozenih());
    }

}
