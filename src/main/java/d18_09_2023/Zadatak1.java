package d18_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        VideoPlayer v = new VideoPlayer(100,30,50,144);
        TimeControl time = new TimeControl(true);
        QualityOptimizerControl quality = new QualityOptimizerControl(10000);
       time.izvrsiAkciju(v);
        quality.izvrsiAkciju(v);


       v. stampaj();


    }
}
