package polimorfismo;

public class BasicRemote implements Remote{
    protected Device device;
    protected boolean isOn;
    public void addDevice(Device device){
        this.device=device;
    }
    public void power(){
        this.isOn=true;
    }
    public void off(){
        this.isOn=false;
    }
    public void volumeUp()throws DeviceNotFoundException, RemoteNotFoundException{
        if(this.isOn){
            if(this.device !=null){
                int atual = this.device.getVolume();
                this.device.setVolume(++atual);
            }
        }
    }
    public void volumeDown()throws DeviceNotFoundException, RemoteNotFoundException{
        if(this.isOn){
            if(this.device !=null){
                int atual = this.device.getVolume();
                this.device.setVolume(--atual);
            }
        }
    }
    public void channelUp()throws DeviceNotFoundException, RemoteNotFoundException{
        if(this.isOn){
            if(this.device !=null){
                int atual = this.device.getChannel();
                this.device.setChannel(++atual);
            }
        }
    }
    public void channelDown()throws DeviceNotFoundException, RemoteNotFoundException{
        if(this.isOn){
            if(this.device !=null){
                int atual = this.device.getChannel();
                this.device.setChannel(--atual);
            }
        }
    }

    public void info()throws DeviceNotFoundException{
        if(this.isOn){
            if(this.device !=null){
                System.out.println("informacoes do dispositivo \n"+this.device.getStatus());
            }
        }
    }
}