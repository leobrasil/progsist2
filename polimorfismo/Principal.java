package polimorfismo;

public class Principal{

    public static void main(String[] args) {
        Device radio1 = new Radio();
        Remote controle1 = new BasicRemote();
        Remote controle2 = new AdvancedRemote();

        radio1.enable(controle1);
        controle1.addDevice(radio1);
        controle1.power();
        try {
            controle1.volumeUp();
            controle1.volumeUp();
            controle1.volumeUp();
            controle1.channelUp();
            controle1.channelUp();
            controle1.info();
            System.out.println(" ----------------");
            radio1.enable(controle2);
            controle2.addDevice(radio1);
            controle2.power();
            controle2.volumeUp();
            controle2.volumeUp();
            controle2.channelUp();
            controle2.info();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}