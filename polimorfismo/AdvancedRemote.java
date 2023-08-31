package polimorfismo;

public class AdvancedRemote extends BasicRemote{ 
    public void volumeUp()throws DeviceNotFoundException, RemoteNotFoundException{
        if(this.isOn){
            if(this.device !=null){
                int atual = this.device.getVolume();
                atual +=2;
                this.device.setVolume(atual);
            }
        }
    }

    public void volumeDown()throws DeviceNotFoundException, RemoteNotFoundException{
        if(this.isOn){
            if(this.device !=null){
                int atual = this.device.getVolume();
                atual -=2;
                this.device.setVolume(atual);
            }
        }
    }
}