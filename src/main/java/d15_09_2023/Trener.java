package d15_09_2023;

public class Trener extends Osoba{
    private int iskustvo;
    private String tip;

    public Trener(String punoIme, String jmbg, int godinaRodjenja, int iskustvo, String tip) {
        super(punoIme, jmbg, godinaRodjenja);
        this.iskustvo = iskustvo;
        this.tip = tip;
    }
    @Override
    public void stampaj (){
        super.stampaj();
        System.out.println("Tip trenera: " + this.tip);
        System.out.println("Trener ima " + this.iskustvo + " godina iskustva.");

    }
}
