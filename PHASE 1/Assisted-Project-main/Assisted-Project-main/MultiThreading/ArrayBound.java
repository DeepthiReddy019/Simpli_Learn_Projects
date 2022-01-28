package MultiThreading;

public class ArrayBound {
    public static void main(String args[])
    {
        int[] array = new int[5];
        try
        {
            array[7] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds!");
        }
        finally
        {
            System.out.println("The Size of the array is: " + array.length);
        }
    }
}