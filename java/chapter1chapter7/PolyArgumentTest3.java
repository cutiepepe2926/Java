import java.util.*;

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv tv = new Tv();
        Computer com = new Computer();
        Audio a = new Audio();
        
        b.buy(tv);
        b.buy(com);
        b.buy(a);
        b.summary();
        System.out.println();   
        b.refund(com);
        b.summary();
    }
}
class Product {
    int price; //제품의 가격
    int bonusPoint; //제품 구매 시 제공하는 포인트

    Product(int price) { //생성자
            this.price = price; //제품 가격 초기화
        bonusPoint = (int)(price/10.0); //포인트는 제품 가격의 10%
    }

    Product() {
        price = 0;
        bonusPoint = 0;
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

class Audio extends Product {
    Audio() {
        //조상 클래스의 생성자 Product(int price)를 호출한다.
        super(50); //스피커의 가격을 50만원으로 한다.
    }

    public String toString() { //object 클래스의 toString()을 오버라이딩한다.
        return "Audio";        
    }
}

class Buyer { //고객, 물건을 사는 사람
    int money = 1000; //소유 금액
    int bonusPoint = 0; //포인트
    Vector<Product> item = new Vector<>(); //구입한 제품을 저장하기 위한 Vector객체

    void buy(Product p){
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
            return;
        }

        money -= p.price; //가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; //제품의 포인트를 추가한다.
        item.add(p); //제품을 Vector에 저장한다.
        System.out.println(p+"을/를 구입하셨습니다.");
    }

    void refund(Product p){ //구매한 제품을 환불한다.
        if(item.remove(p)){ //제품을 Vector에서 제거한다.
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p+"을/를 반품하셨습니다.");
        }
        else { //제거 실패 시
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() { //구매한 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0; //구입한 물품의 가격 합계
        String itemList =""; //구입한 물품 목록

        if(item.isEmpty()){ //Vector가 비어있는지 확인한다.
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        //반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for(int i=0;i<item.size(); i++){
            Product p = (Product)item.get(i); //Vector의 i번째에 있는 객체를 가져와서 Product로 형변환(업캐스팅)
            sum += p.price;
            itemList += (i==0) ? ""+p:", "+p;
        }
        System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
        System.out.println("구입하신 제품은 "+itemList+"입니다.");
    }
}
