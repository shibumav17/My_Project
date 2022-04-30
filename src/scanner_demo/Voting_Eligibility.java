package scanner_demo;

import java.util.Scanner;

public class Voting_Eligibility {
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        System.out.println("Welcome to Voting app, please enter your age: ");

        int age = object.nextInt();

        if (age>18){
            System.out.println("You are eligile for voting ...");

        }
        else {
            System.out.println("You are not eligible for voting...");
        }
    }
}
