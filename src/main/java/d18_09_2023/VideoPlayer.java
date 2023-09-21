package d18_09_2023;

public class VideoPlayer {
    private double duzina;
    private double trenutnoVreme;
    private double jacinaZvuka;
    private  double kvalitet;

    public VideoPlayer(double duzina, double trenutnoVreme, double jacinaZvuka, double kvalitet) {
        this.duzina = duzina;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitet = kvalitet;
    }
    public void stampaj (){
        System.out.println("Trenutno Vreme videa: " + this.trenutnoVreme);
        System.out.println("Jacina zvuka: " + this.jacinaZvuka);
        System.out.println("Kvalitet videa: " + this.kvalitet);
    }

    public double getDuzina() {
        return duzina;
    }

    public void setDuzina(double duzina) {
        this.duzina = duzina;
    }

    public double getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(double trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public double getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(double jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public double getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(double kvalitet) {
        this.kvalitet = kvalitet;
    }
}
