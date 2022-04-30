package method;

import java.util.Scanner;

public class Calc_with_input_parameter {

    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;

    }

    public int multiply(int a , int b){
        return a*b;
    }

    public int divide(int a , int b){
        return a/b;

    }

    public static void main(String[] args) {
        Calc_with_input_parameter  obj = new Calc_with_input_parameter();
        Scanner sc  = new Scanner(System.in);

        int flag = 0;
        int result = 0;

        while (flag==0) {
            System.out.println("Press : 1 for Addition, 2 for Subtraction, 3 for multiplication, 4 for division ");
            int choice = sc.nextInt();

            System.out.println("Enter value of a : ");
            int a = sc.nextInt();
            System.out.println("Enter value of b : ");
            int b = sc.nextInt();

            if (choice == 1) {
                result = obj.add(a, b);
                System.out.println("Addition is : " + result);
            } else if (choice == 2) {
                result = obj.sub(a, b);
                System.out.println("Subtraction is : " + result);
            } else if (choice == 3) {
                result = obj.multiply(a, b);
                System.out.println("Multiplication is : " + result);

            } else if (choice == 4) {
                result = obj.divide(a, b);
                System.out.println("Division is : " + result);
            }


            System.out.println("Press: 0 to continue or 1 to exit  ");
            Scanner loopscanner = new Scanner(System.in);
            flag = loopscanner.nextInt();
        }

    }
}



