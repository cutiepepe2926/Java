public class CloneEx1 {
    public static void main(String args[]){
        Point original = new Point(3,5);
        Point copy = (Point)original.clone(); //복제(clone)해서 새로운 객체를 생성

        System.out.println(original);
        System.out.println(copy);
    }
}

class Point implements Cloneable { 
    //Cloneable 인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다.
    //이 인터페이스 미 구현 시 clone() 호출하면 예외 발생

    int x;
    int y;
    
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return "x="+x+", y="+y;
    }

    public Object clone(){
        Object obj = null;
        try {
            obj = super.clone();
            //clone()메서드에는 CloneNotSupportedException이 선언되어 있어
            //try-catch로 예외처리해주어야 함
        } catch (CloneNotSupportedException e) {
        }
        return obj;
    }
}

