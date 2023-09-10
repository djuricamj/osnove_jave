package d08_09_2023;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezinaUGr;
    public double cenaSaPopustom;
    public int postarina;


    public void stampaj(){

        System.out.println("Proizvod " + this.naziv + " cija je cana " + this.cena + " din ima " + this.tezinaUGr + "gr.");


    }
    public void povecajCenu( int povecanje){
        cena = cena + povecanje;

    }

    public double vratiCenuSaPopustom(double popust){
        cenaSaPopustom = cena - (cena * (popust / 100));

        return cenaSaPopustom;

    }

    public int racunajPostarinu (){
        if (tezinaUGr <= 100){
            return 200;
        }else if (tezinaUGr > 100 && tezinaUGr <=500){
            return 400;
        }else {
            return 1000;
        }
    }


}


