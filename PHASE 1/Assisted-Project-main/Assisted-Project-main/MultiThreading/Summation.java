package MultiThreading;

public class Summation {
    public int sum(int x, int y)
    {
        return (x + y);
    }
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
    public double sum(double x, double y)
    {
        return (x + y);
    }
    public static void main(String args[])
    {
        Summation s = new Summation();
        System.out.println(s.sum(24, 19));
        System.out.println(s.sum(24, 19, 21));
        System.out.println(s.sum(12.5, 42.5));
    }
}
