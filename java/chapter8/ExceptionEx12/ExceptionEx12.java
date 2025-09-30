public class ExceptionEx12 {
    public static void main(String args[]){
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); //0으로 나누어 ArithmeticException을 발생시킨다.
            System.out.println(4); //실행되지 않는다.
        } 
        catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("예외 메시지 : " + ae.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception이 발생했습니다.");
        }  //try-catch의 끝
        System.out.println(6);
    }    //main의 끝
}
