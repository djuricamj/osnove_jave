package d18_09_2023;

public class QualityOptimizerControl extends Control {
    private double brzinaInterneta;

    public QualityOptimizerControl(double brzinaInterneta) {
        super();
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer video) {
       double kvalitetVidea = 144;
       video.setKvalitet(kvalitetVidea);
       double noviKvalitet = this.brzinaInterneta * 10.1;
       if (noviKvalitet > kvalitetVidea && noviKvalitet <= 240){
           video.setKvalitet(240);
       } else if (noviKvalitet > 240 && noviKvalitet <= 360) {
           video.setKvalitet(360);
       }else if (noviKvalitet > 360 && noviKvalitet <= 480){
           video.setKvalitet(480);
       } else if (noviKvalitet > 480 && noviKvalitet <= 720) {
           video.setKvalitet(720);

       }else if (noviKvalitet > 720 ){
           video.setKvalitet(1080);
       }


    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
}
