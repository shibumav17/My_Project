package interview_programs;

import java.util.Scanner;

public class Factorial_program {

    //Factorial
    public static void main(String[] args) {

        System.out.println("Enter a no. for its factorial :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = n; i >0 ; i--) {
        factorial= factorial*i;}
    {
        System.out.println("Factorial is : " + factorial);
    }
    }

}
