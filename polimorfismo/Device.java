package polimorfismo;


public interface Device{
    public void enable(Remote remote);
    public void disable();
    public int getVolume();
    public void setVolume(int v)throws RemoteNotFoundException;
    public int getChannel();
    public void setChannel(int channel)throws RemoteNotFoundException;
    public String getStatus();


}