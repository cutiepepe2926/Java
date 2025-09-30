public class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card("HEART",10);
        //c.NUMBER =  5; <- 해당 코드는 이미 값이 설정된 final 멤버 
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
    }
}

class Card {
    final int NUMBER; //상수지만 선언과 함께 초기화하지 않고
    final String KIND; //생성자에서 단 한번만 초기화 할 수 있다.
    static int width = 100;
    static int height = 250;

    Card(String kind, int num){
        KIND = kind;
        NUMBER = num;
    }

    Card() {
        this("HEART",1);
    }

    public String toString(){
        return ""+KIND+" "+NUMBER;
    }
}