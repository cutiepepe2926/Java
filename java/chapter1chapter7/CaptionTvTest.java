public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel=10; //조상 클래스로부터 상속받은 멤버
        ctv.channelUp(); //조상 클래스로부터 상속받은 메서드
        System.out.println(ctv.channel);        
        ctv.displayCaption("Hello World");
        ctv.Caption = true;
        ctv.displayCaption("Hello World");
    }
}

class Tv {
    boolean power; //전원상태(On/Off)
    int channel; //채널

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class CaptionTv extends Tv {
    boolean Caption; //캡션 상태(On/Off)
    void displayCaption(String text) {
        if(Caption) {
            System.out.println(text);
        }
    }
}
