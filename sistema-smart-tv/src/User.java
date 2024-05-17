public class User {
    public static void main(String[] args) {
            SmartTv smartTv = new SmartTv();

            System.out.println("TV Ligada? " + smartTv.isOn);
            System.out.println("Canal atual: " + smartTv.channel);
            System.out.println("Volume atual: " + smartTv.sound);

            smartTv.turnOn();
            System.out.println("Novo Status -> TV Ligada? " + smartTv.isOn);

            smartTv.turnOff();
            System.out.println("Novo Status -> TV Ligada? " + smartTv.isOn);

            smartTv.volumeUp();
            smartTv.volumeUp();
            smartTv.volumeUp();
            System.out.println("Volume Atual: " + smartTv.sound);

            smartTv.volumeDown();
            smartTv.volumeDown();
            System.out.println("Volume Atual: " + smartTv.sound);

            System.out.println("Canal Atual: " + smartTv.channel);
            smartTv.changeChannel(13);
            System.out.println("Canal Atual: " + smartTv.channel);
    }
}