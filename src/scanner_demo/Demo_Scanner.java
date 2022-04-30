package scanner_demo;

import java.util.Scanner;

public class Demo_Scanner {
    public static void main(String[] args) {

        // Object of Scanner class:
        Scanner object = new Scanner(System.in);

        // String Data:
        System.out.println("Please enter your name :");

        String name = object.nextLine();
        System.out.println("You have entered your name "+ name);

        // int data:
        System.out.println("Please enter your age :");

        int age = object.nextInt();
        System.out.println("You have  entered your age " +age);

        //double(decimal) data :
        System.out.println("You have entered your weight: ");

        double weight = object.nextDouble();
        System.out.println("You have entered your weight " + weight);



    }
}
