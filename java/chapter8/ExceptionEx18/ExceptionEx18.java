public class ExceptionEx18 {
    public static void main(String args[]) throws  Exception{
        method1(); //같은 클래스내의 static 멤버이므로 객체 생성없이 직접 호출 가능.
    } //main의 끝

    static void method1() throws Exception {
        method2();
    } //method1의 끝

    static void method2() throws Exception {
        throw new Exception(); //예외를 발생시킨다.
    } //method2의 끝
}
