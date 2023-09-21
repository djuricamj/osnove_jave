package d18_09_2023;

public class TimeControl extends Control {
    private boolean vreme;

    public TimeControl() {
        super();
    }

    public TimeControl(boolean vreme) {
        this.vreme = vreme;
    }


    @Override
    public void izvrsiAkciju(VideoPlayer video) {
        double trenutnoVreme = video.getTrenutnoVreme();
     if (this.vreme && video.getTrenutnoVreme() < video.getDuzina()){
         video.setTrenutnoVreme(trenutnoVreme + 15);
     }else if (!this.vreme && video.getTrenutnoVreme() > 0 ){
         video.setTrenutnoVreme(trenutnoVreme - 15);
     }
    }


}
