package Deepthi.Assessment;

import java.util.Arrays;
import java.util.Scanner;

public class Practise8 {

    public static void main(String[] args) {
        System.out.println("Enter the Group of numbers");
        int number= new Scanner(System.in).nextInt();
        String num = Integer.toString(number);
        int []sort = new int[num.length()];
        for(int i=0;i<num.length();i++) {
            sort[i]=num.charAt(i)-'0';
        }
        Practise8 exe = new Practise8();
        int result=exe.getSecondSmallest(sort);
        System.out.println("The second smallest number is "+ result);


    }
    int getSecondSmallest(int [] numbers) {
        Arrays.sort(numbers);
        return numbers[1];
    }
}
