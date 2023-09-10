package d08_09_2023;

public class FacebookPost {

    public String objavljivac;
    public String vlasnikProfila;
    public String tekst;
    public int brLajkova;
    public int brDeljenja;

    public void like (){
        brLajkova = brLajkova + 1;

    }

    public void dislike(){
        brLajkova = brLajkova - 1;
        if (brLajkova <0){
            brLajkova = 0;
        }
    }

    public void share (){
        brDeljenja = brDeljenja + 1;
    }

    public void print (){
        System.out.println(this.objavljivac + " >>> " + this.vlasnikProfila );
        System.out.println(this.tekst);
        System.out.println("Likes " + this.brLajkova + " | Shares" + this.brDeljenja );
    }

}
