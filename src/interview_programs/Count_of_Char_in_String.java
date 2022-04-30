package interview_programs;

import java.util.Scanner;

public class Count_of_Char_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");

        String s = sc.nextLine();
        System.out.println("Length of string : " +s.length());

        int count = 0;

        for (int i =0; i<s.length();i++){
            if(s.charAt(i)!=' '){
            count++;
            }
        }
        System.out.println("No. of characters in String: " +count);
    }
}
