public class SmartTv {
    boolean isOn = false;
    int channel = 1;
    int sound = 25;

    public void turnOn(){
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void volumeUp(){
        sound++;
    }

    public void volumeDown(){
        sound--;
    }

    public void increaseChannel(){
        channel++;
    }

    public void decreaseChannel(){
        channel--;
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }
}
