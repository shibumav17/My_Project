package interview_programs;

import java.util.Scanner;

public class Swap_program {

    //Swap Logic: Let a = 12 , b = 20
    //a = a + b = 12 + 20 = 32
    //b = a - b = 32 - 20 = 12
    //a = a - b = 32 - 20 = 12

    public static void main(String[] args) {
        System.out.println("This is a program for Swapping of two no.s without using third variable ");

        System.out.println("Enter the values : ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a : ");
        int a = sc.nextInt();

        System.out.println("Enter value of b : ");
        int b = sc.nextInt();

        System.out.println("Value of a & b before swapping : " +a + " " +b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a &  b after swapping: " +a +" " +b);


    }
}
