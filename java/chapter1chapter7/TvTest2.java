class Tv {
	//TV의 속성(멤버 변수)
	String color; //색상
	boolean power; //전원상태(On/Off)
	int channel; //채널
	
	//TV의 기능(메서드)
	void power() { power = !power; } // TV 전원 켜기/끄기
	void channelUp() { ++channel; } // TV 채널 높이기
	void channelDown() { --channel; } // TV 채널 낮추기
}

public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은 "+t1.channel+"입니다.");
        System.out.println("t2의 channel 값은 "+t2.channel+"입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경");

        System.out.println("t1의 channel 값은 "+t1.channel+"입니다.");
        System.out.println("t2의 channel 값은 "+t2.channel+"입니다.");
    }
}
