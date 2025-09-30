class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setChannel(int channel){
        if(channel>MIN_CHANNEL||channel<MAX_CHANNEL){
            this.channel = channel;
        }
        else {
            System.out.println("잘못된 채널 선택");
        }
    }

    public void setVolume(int volume){
        if(volume>MIN_VOLUME||volume<MAX_VOLUME){
            this.volume = volume;
        }
        else {
            System.out.println("잘못된 볼륨 선택");
        }
    }

    public int getChannel(){
        return this.channel;
    }

    public int getVolume(){
        return this.volume;
    }

}

public class Exercise7_10 {
    public static void main(String args[]){
        MyTv2 t =new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());
    }
}
