package MultiThreading;

public class ThrowArthimatic {
    void Division() throws ArithmeticException
    {
        float a=40,b=7,rs;
        rs = a / b;
        System.out.print("\n\t The result is : " + rs);
    }
    public static void main(String[] args)
    {
        ThrowArthimatic T = new ThrowArthimatic();
        try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\t This program ends here.");
    }
}


