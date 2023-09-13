package d12_09_2023;

import java.util.SplittableRandom;

public class ZeleniKarton {
    private String punoImeStudenta;
    private int brIndeksa;
    private String predmet;
    private String punoImeProfeora;
    private int ocena;

    public ZeleniKarton(String punoImeStudenta, int brIndeksa, String predmet, String punoImeProfeora, int ocena) {
        this.punoImeStudenta = punoImeStudenta;
        this.brIndeksa = brIndeksa;
        this.predmet = predmet;
        this. punoImeProfeora = punoImeProfeora;
        this.ocena = ocena;
    }

    public String polozenIspit(){
        if (this.ocena > 5 ){
            return "Ispit je polozen";
        }else  return "Ispit nije polozen";
    }
    public void stampaj (){
        System.out.println(this.predmet + " - " + this.ocena);
        System.out.println("Student: " + punoImeStudenta + ", " + this.brIndeksa);
        System.out.println("Profesor: " + this.punoImeProfeora);
    }

    public String getPunoImeStudenta() {
        return punoImeStudenta;
    }

    public void setPunoImeStudenta(String punoImeStudenta) {
        this.punoImeStudenta = punoImeStudenta;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getPunoImeProfeora() {
        return punoImeProfeora;
    }

    public void setPunoImeProfeora(String punoImeProfeora) {
        this.punoImeProfeora = punoImeProfeora;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
}
