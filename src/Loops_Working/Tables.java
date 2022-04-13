package Loops_Working;

public class Tables {

    public static void main(String[] args) {

        int two = 2;
        //Table of 2:

        for (int i = 1; i <= 10; i++) {
            System.out.println("table of two: " + two * i);
        }


        //Table of 5:
        int five = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println("table of five: " + five * i);
        }


        //Factorial of 5:
        int factorial = 1;
        int num = 5;
        for (int i = 5; i >0 ; i--) {
           factorial= factorial*i;}
        {
             System.out.println("Factorial of 5: " + factorial);
         }



    }
}
