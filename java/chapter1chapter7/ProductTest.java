public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호(serial No)는"+p1.serialNo);
        System.out.println("p2의 제품번호(serial No)는"+p2.serialNo);
        System.out.println("p3의 제품번호(serial No)는"+p3.serialNo);
    }
}

class Product {
    static int count = 0; //생성된 인스턴스의 수를 저장하기 위한 변수
    int serialNo; //인스턴스 고유 번호

    { 
        ++count;
        serialNo = count;

        /*Product인스턴가 생성될 때 마다 count의 
        값을 1씩 증가시켜서 serialNo에 저장한다.*/
    }

    public Product() {}
}
