public class CallByValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Before Swap : "+"a = "+a+" b = "+b);
        swap(a,b);
        System.out.println("After Swap : "+"a = "+a+" b = "+b);


    }

    static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
}
