package Deepthi.Assessment;


import java.util.Scanner;

public class Practise12  {

    public static void main(String[] args) {
        Practise12 exe = new Practise12 ();
        System.out.println("Enter the number: ");
        int number=new Scanner(System.in).nextInt();
        boolean flag=exe.checkNumber(number);
        if(flag)
            System.out.println(number+" is a power of 2 ");
        else
            System.out.println(number+" is not a power of 2 ");

    }

    boolean checkNumber(int n) {
        boolean flag=false;
        for(int i=1;i<=n;i*=2) {
            if(i==n) {
                flag=true;
            }

        }
        return flag;
    }

}
