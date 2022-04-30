package scanner_demo;

import java.util.Scanner;

public class Marksheet {
    //CBSE 12th Marksheet
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        double total_marks = 500;
        System.out.println("Enter marks for subjects");

        System.out.println("Enter your marks for English: ");
        double a = obj.nextDouble();

        System.out.println("Enter your marks for Hindi: ");
        double b = obj.nextDouble();

        System.out.println("Enter your marks for Maths: ");
        double c = obj.nextDouble();

        System.out.println("Enter your marks for Physics:");
        double d = obj.nextDouble();

        System.out.println("Enter your marks for Chemistry: ");
        double e = obj.nextDouble();

        System.out.println("Your total marks is :"+(a+b+c+d+e));
        System.out.println("Your percentage is : " +((a+b+c+d+e)/total_marks)*100);


    }
}
