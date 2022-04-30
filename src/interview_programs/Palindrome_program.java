package interview_programs;

import java.util.Scanner;

public class Palindrome_program {

    public static void main(String[] args) {

        System.out.println("Enter a no. to check whether it is a palindrome no. or not : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = n;
        int sum = 0 ;

        while (n>0) {
            int rem = n % 10;
            sum = (sum*10)+rem;
            n = n/10;
        }
        if (value == sum){
            System.out.println("It is a palindrome no.  ");
        }
        else{
            System.out.println("It is not a palindrome no. ");
        }
    }
}
