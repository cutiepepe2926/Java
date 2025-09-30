public class ExceptionEx6 {
    public static void main(String args[]){
        try {
            Exception e = new Exception("고의로 발생시켰음.");
            throw e; //예외를 발생시키기
            //throw new Exception("고의로 발생시켰음."); //위 두 줄을 한 줄로 줄일 수 있다.
        } catch (Exception e) {
            System.out.println("예외 메시지 : " + e.getMessage());
            e.printStackTrace(); //예외가 발생한 위치를 추적할 수 있도록 스택 트레이스를 출력한다.
        }
        System.out.println("프로그램 정상 종료");
    }    
}
