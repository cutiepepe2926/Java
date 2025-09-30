public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x: "+x+", y : "+y;
    }
}

class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y); //조상 클래스의 생성자 Point(int x, int y)를 호출한다.
        this.z = z;
    }

    String getLocation() {
        return "x: "+x+", y : "+y+", z : "+z;
    }
    
}

