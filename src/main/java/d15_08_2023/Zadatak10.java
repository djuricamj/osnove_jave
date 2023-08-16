package d15_08_2023;

public class Zadatak10 {
    public static void main(String[] args) {

//        Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se skine fajl.
//        Program od informacija cuva naziv fajla, velicinu fajla i brzinu skidanja. Velicina fajla
//        je u Mb a brzina skidana u Mb/s (megabajt u sekundi)
//        Primer izvrsenja
//        File: profile-image.log
//        Size: 25Mb
//        Download speed: 3Mb/s
//
//        Estimated time: 8s

        String fileName = "imgimg";
        double size = 25;
        double downloadSpeed = 3;

        double estimatdTime = size / downloadSpeed;

        System.out.println("File: " + fileName);
        System.out.println("Size: " + size + "Mb");
        System.out.println("Download speed: " + downloadSpeed + "Mb/s");
        System.out.println(" ");
        System.out.println("Estimated time: " + (int)estimatdTime + "s");

    }

}
