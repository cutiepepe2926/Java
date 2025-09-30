public class SingletonTest {
    public static void main(String[] args) {
        //Singleton s = new Singleton(); <- 생성자가 private라서 접근이 불가능하다.
        Singleton s1 = Singleton.getInstance();
    }
}

final class Singleton {
    private static Singleton s = new Singleton(); 
    //getInstance()에서 사용될 수 있도록 인스턴스가 미리 생성되어야
    //하기 때문에 static으로 선언해준다.

    private Singleton() {
        //...
    }

    //인스턴스를 생성하지 않고도 호출할 수 있어야 하므로 static이어야 한다.
    public static Singleton getInstance() {
        if(s==null) {
            s = new Singleton();
        }
        return s;
    }
}