package Deepthi.Assessment;

import java.util.Arrays;
import java.util.Scanner;

public class Practise6 {

    public static void main(String[] args) {
        System.out.println("Enter the Word: ");
        String alpha=new Scanner(System.in).nextLine();
        String []split = alpha.split("");

        Practise6 exe = new Practise6();
        String [] result = exe.sort(split);
        System.out.println("The sorted list is ");
        for(String str:result) {
            System.out.print(str);
        }


    }
    String[] sort(String[] alpha) {
        Arrays.sort(alpha);
        int mid = alpha.length/2;
        for(int i=0;i<mid;i++) {
            alpha[i]=alpha[i].toUpperCase();
        }
        if(alpha.length%2 !=0)
            alpha[mid]=alpha[mid+1].toUpperCase();
        return alpha;

    }
}
