public class inheritance {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.age = 40;
        Child c = new Child();
        c.age = 20;
        System.out.println(p.age);
        System.out.println(c.age);
        p.hello();
        c.hello();
        c.play();

    }


}
class Parent {
        int age;
        
        void hello(){
            System.out.println("Hello");
        }
    }

    class Child extends Parent {
        void hello(){
            System.out.println("Play");
        }
        void play() {
            System.out.println("Play2");
        }
    }