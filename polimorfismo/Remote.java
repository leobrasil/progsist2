package polimorfismo;

public interface Remote{
    public void addDevice(Device device);
    public void power();
    public void off();
    public void volumeUp()throws DeviceNotFoundException, RemoteNotFoundException;
    public void volumeDown()throws DeviceNotFoundException, RemoteNotFoundException;
    public void channelUp()throws DeviceNotFoundException, RemoteNotFoundException;
    public void channelDown()throws DeviceNotFoundException, RemoteNotFoundException;
    public void info()throws DeviceNotFoundException, RemoteNotFoundException;

}