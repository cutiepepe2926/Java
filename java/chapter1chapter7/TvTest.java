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

class TvTest{
    public static void main(String[] args) {
        Tv t;
        t= new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 "+t.channel+"입니다.");
    }
}