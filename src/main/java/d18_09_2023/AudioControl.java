package d18_09_2023;

public class AudioControl extends Control{

    private boolean zvuk;

    public AudioControl(boolean zvuk) {
        super();
        this.zvuk = zvuk;
    }
    public void izvrsiAkciju(VideoPlayer video) {
        double jacinaZvuka = video.getJacinaZvuka();
        if (this.zvuk && video.getJacinaZvuka() < 100){
            video.setJacinaZvuka(jacinaZvuka + 1);
        }else if (!this.zvuk && video.getJacinaZvuka() > 0 ){
            video.setJacinaZvuka(jacinaZvuka - 1);
        }
    }

    public boolean isZvuk() {
        return zvuk;
    }

    public void setZvuk(boolean zvuk) {
        this.zvuk = zvuk;
    }
}
