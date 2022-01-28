package Javaintandcol;

public class MethodCall {
    int val=150;

    int operation(int val) {
        val =val*10/100;
        return(val);
    }

    public static void main(String args[]) {
        MethodCall d = new MethodCall();
        System.out.println("Before the value of data is "+d.val);
        d.operation(100);
        System.out.println("After value of data is "+d.val);
    }
}
