package method;

import java.util.Scanner;

public class Calculator {

/*TODO SYNTAX : access_specifier return_type method_name (parameter) {CODE}
       //access_specifier -> public, private, protected, default THEORY PART
       //return_type -> output of function or method : void : no return type
       //method_name -> can be anything : should be meaningful
       //parameter -> input parameter : optional */

    //CALCULATOR
    // add , subtract, multiply, divide :
    //SYNTAX : access_specifier return_type method_name (parameter) {CODE}

    public void addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ADDITION : ");
        System.out.println("Enter value of a :");
        int a = sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        System.out.println("Addition of a & b is :" + (a + b));

    }

    public void subtraction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("SUBTRACTION : ");
        System.out.println("Enter value of a :");
        int a = sc.nextInt();
        System.out.println("Enter value of b :");
        int b = sc.nextInt();
        int sub = a - b;
        System.out.println("Subtraction of a & b is: " + sub);

    }

    public void multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("MULTIPLICATION : ");
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b :");
        int b = sc.nextInt();
        int multiply = a * b;
        System.out.println("Multiplication of a & b is: " + multiply);

    }

    public void division() {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIVISION : ");
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        int divide = a / b;
        System.out.println("Division of a & b is : " + divide);
    }


    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Scanner obj2 = new Scanner(System.in);

        String flag = "y";

        while (flag.equals("y")) {

            System.out.println("Please enter your choice : 1 for Addition, 2 for Subtraction , 3 for Multiplication, 4 for Division ");
            int choice = obj2.nextInt();
            if (choice == 1) {
                obj.addition();
            } else if (choice == 2) {
                obj.subtraction();
            } else if (choice == 3) {
                obj.multiplication();
            }
            else if (choice==4){
                obj.division();
            }

            Scanner loopscanner = new Scanner(System.in);
            System.out.println("Enter n to exit or y to continue");
            flag = loopscanner.nextLine();


        }
    }

}
