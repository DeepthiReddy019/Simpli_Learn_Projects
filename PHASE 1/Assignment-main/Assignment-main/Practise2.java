package Deepthi.Assessment;


import java.util.Scanner;

public class Practise2 {

    //Practise 2: Create a method that accepts a String and checks if it is a positive string.
    //The method should return true if the entered string is positive.


    public static void main(String[] args) {
        Practise2 er= new Practise2();
        System.out.println("Enter the string:");
        String word=new Scanner(System.in).nextLine();
        boolean flag=er.positive(word);

        if(flag)
            System.out.println("The string is positive");
        else
            System.out.println("The string is negative");

    }
    boolean positive(String word) {
        word=word.toLowerCase();
        int number=word.charAt(0),len=word.length();
        boolean flag=true;
        for(int i=1;i<len;i++) {
            int check=word.charAt(i);
            if(number>check) {
                flag = false;
            }
            number=check;
        }
        return flag;
    }

}
