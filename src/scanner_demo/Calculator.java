package scanner_demo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        // Calculator :

        System.out.println("Please enter value of a :");
        int a = object.nextInt();

        System.out.println("Please enter value of b : ");
        int b = object.nextInt();

        System.out.println("Please enter your choice : ");
        Scanner object1 = new Scanner(System.in);
        String choice = object1.nextLine();

        if (choice=="ADD" || choice.equals("ADD")){
            System.out.println("Addition of a & b is : " +(a+b));
        }

        else if (choice=="SUBTRACT" || choice.equals("SUBTRACT")) {
            System.out.println("Subtraction of a & b is : " + (a-b));
        }

        else if (choice =="MULTIPLY" || choice.equals("MULTIPLY")){
            System.out.println("Multiplication of a & b is : " +(a*b));
        }

        else if (choice=="DIVIDE" || choice.equals("DIVIDE")){
            System.out.println("Division of a & b is :" +(a/b));
        }

    }
}
