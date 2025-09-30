public class Exercise7_18 {

    public static void action(Robot r){
        try {
            if(r instanceof DanceRobot){
                ((DanceRobot) r).dance();
            }
            if(r instanceof SingRobot){
                ((SingRobot) r).Sing();
            }
            if(r instanceof DrawRobot){
                ((DrawRobot) r).draw();
            }   
        } 
        catch (Exception e) {
            System.out.println("해당 되는 클래스 없음.");
        }
    }
    public static void main(String args[]){
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for(int i=0; i<arr.length; i++){
            action(arr[i]);
        }
    }
}

class Robot {}

class DanceRobot extends Robot {
    void dance(){
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot extends Robot {
    void Sing(){
        System.out.println("노래를 합니다.");
    }
}

class DrawRobot extends Robot {
    void draw(){
        System.out.println("그림을 그립니다.");
    }
}