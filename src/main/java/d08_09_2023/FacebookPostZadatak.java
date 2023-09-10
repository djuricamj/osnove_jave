package d08_09_2023;

import javax.naming.OperationNotSupportedException;

public class FacebookPostZadatak {
    public static void main(String[] args) {


        FacebookPost postOne = new FacebookPost();

        postOne.objavljivac = "Pera Peric";
        postOne.vlasnikProfila = "Jovan Jovanovic";
        postOne.tekst = "Danas smo pobedili!";
        postOne.brLajkova = 1000;
        postOne.brDeljenja = 100;


        FacebookPost postTwo = new FacebookPost();

        postTwo.objavljivac = "Ivana Ivanovic";
        postTwo.vlasnikProfila = "Sara Saric";
        postTwo.tekst = "Napred Srbija";
        postTwo.brLajkova = 1000;
        postTwo.brDeljenja = 200;

        postOne.like();
        postOne.like();
        postOne.like();
        postOne.like();
        postOne.like();
        postOne.like();
        postOne.like();
        postOne.like();
        postOne.like();
        postOne.like();
        postOne.like();
        postOne.like();

        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();
        postTwo.like();




        postOne.dislike();
        postOne.dislike();
        postOne.dislike();
        postOne.dislike();

        postTwo.dislike();

        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();
        postOne.share();

        postTwo.share();
        postTwo.share();
        postTwo.share();
        postTwo.share();
        postTwo.share();
        postTwo.share();
        postTwo.share();
        postTwo.share();
        postTwo.share();
        postTwo.share();
        postTwo.share();
        postTwo.share();
        postTwo.share();
        postTwo.share();
        postTwo.share();
        postTwo.share();


        postOne.print();
        System.out.println();
        postTwo.print();








    }
}
