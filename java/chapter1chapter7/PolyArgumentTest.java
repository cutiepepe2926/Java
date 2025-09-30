public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv tv = new Tv();
        Computer com = new Computer();

        b.buy(tv);
        b.buy(com);
        
        System.out.println("현재 남은 돈은 "+b.money+"만원입니다.");
        System.out.println("현재 포인트는 "+b.bonusPoint+"점 입니다.");
    }
}
class Product {
    int price; //제품의 가격
    int bonusPoint; //제품 구매 시 제공하는 포인트

    Product(int price) { //생성자
        this.price = price; //제품 가격 초기화
        bonusPoint = (int)(price/10.0); //포인트는 제품 가격의 10%
    }
}
class Tv extends Product {
    Tv() {
        //조상 클래스의 생성자 Product(int price)를 호출한다.
        super(100); //Tv의 가격을 100만원으로 한다.
    }

    public String toString() { //object 클래스의 toString()을 오버라이딩한다.
        return "Tv";        
    }
}

class Computer extends Product {
    Computer() {
        //조상 클래스의 생성자 Product(int price)를 호출한다.
        super(200); //컴퓨터의 가격을 200만원으로 한다.
    }

    public String toString() { //object 클래스의 toString()을 오버라이딩한다.
        return "Computer";        
    }
}

class Buyer { //고객, 물건을 사는 사람
    int money = 1000; //소유 금액
    int bonusPoint = 0; //포인트

    void buy(Product p){
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
            return;
        }

        money -= p.price; //가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; //제품의 포인트를 추가한다.
        System.out.println(p+"을/를 구입하셨습니다.");
    }
}