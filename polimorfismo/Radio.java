package polimorfismo;

public class Radio implements Device{
    private int volumeLevel;
    private int channelNumber;
    private Remote remote;
    private final int MAX_VOL = 100;
    private final int MAX_CHANNEL = 50;

    public void enable(Remote remote){
        this.remote=remote;
    }
    public void disable(){
        this.remote = null;
    }
    public int getVolume(){
        return this.volumeLevel;
    }
    public void setVolume(int v)throws RemoteNotFoundException{
        if(this.remote !=null){
            if(this.volumeLevel < MAX_VOL)
                this.volumeLevel++;
            else
                System.out.println("ja esta no volume maximo");
        }else{
            throw new RemoteNotFoundException("Controle nao encontrado");

        }

    }


    public int getChannel(){
        return this.channelNumber;
    }
    public void setChannel(int channel)throws RemoteNotFoundException{
        if(this.remote !=null){
            if(channel <= this.MAX_CHANNEL)
                this.channelNumber = channel;
        }else{
            throw new RemoteNotFoundException("Controle nao encontrado");
        }
    }


    public String getStatus(){
        StringBuffer sb = new StringBuffer();
        sb.append("Canal = "+this.channelNumber)
        .append("\n volume = "+this.volumeLevel);
        return sb.toString();
        
    }

}