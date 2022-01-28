package Deepthi.Assessment;

import java.util.Scanner;

public class Practise10 {

    public static void main(String[] args) {
        Practise10 square= new Practise10();
        System.out.println("Enter the number");
        int number=new Scanner(System.in).nextInt();
        int result=square.calculateDifference(number);
        System.out.println("The Difference is "+ result);

    }
    int calculateDifference(int number) {
        int sumSquare=0,sum=0;
        for(int i=1;i<=number;i++) {
            sumSquare+=(i*i);
            sum+=i;
        }
        sum*=sum;
        return sumSquare-sum;
    }
}
