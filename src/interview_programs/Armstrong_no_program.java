package interview_programs;

import java.util.Scanner;

public class Armstrong_no_program {

    public static void main(String[] args) {
        System.out.println("Enter a no. to check whether it is an Armstrong no. or not : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = n;
        int sum = 0;

        while (n>0) {
            int r = n % 10;
            sum = (r*r*r)+sum;
            n = n/10;
        }

        if (value==sum){
            System.out.println("It is an Armstrong number ");
        }
        else{
            System.out.println("It is not an Armstrong number");
        }

    }
}
