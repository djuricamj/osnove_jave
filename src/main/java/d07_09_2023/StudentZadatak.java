package d07_09_2023;

public class StudentZadatak {
    public static void main(String[] args) {

        Student studentJedan = new Student();

        studentJedan.ime = "Petar Peric";
        studentJedan.brojIndeksa = 67;
        studentJedan.fakultet = "PMF";

        Student studentDva = new Student();

        studentDva.ime = "Jana Jovanc";
        studentDva.brojIndeksa = 56;
        studentDva.fakultet = "PMF";

        Student studentTri = new Student();

        studentTri.ime = "Sanja Tavic";
        studentTri.brojIndeksa = 88;
        studentTri.fakultet = "FPN";

        System.out.println("Student 1: " + studentJedan.ime);
        System.out.println("Fakultet: " + studentJedan.fakultet + " br indeksa: " + studentJedan.brojIndeksa);
        System.out.println();
        System.out.println("Student 2: " + studentDva.ime);
        System.out.println("Fakultet: " + studentDva.fakultet + " br indeksa: " + studentDva.brojIndeksa);
        System.out.println();
        System.out.println("Student 3: " + studentTri.ime);
        System.out.println("Fakultet: " + studentTri.fakultet + " br indeksa: " + studentTri.brojIndeksa);
        System.out.println();
    }
    }







