
import java.util.Vector;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private Vector<Integer> channelList = new Vector<Integer>();

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setChannel(int channel){
        if(channel>MIN_CHANNEL||channel<MAX_CHANNEL){
            this.channel = channel;
            channelList.add(channel);
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

    public void gotoPrevChannel() {
        int num = channelList.size();
        if(num==0){
            System.out.println("이전 채널이 없습니다.");
        }
        else {
            int channel = channelList.get(num-2); 
            channelList.remove(num-2);
            setChannel(channel);
        }
    }

}

public class Exercise7_11 {
    public static void main(String args[]){
        MyTv2 t =new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());

    }
}
