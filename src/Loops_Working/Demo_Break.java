package Loops_Working;

public class Demo_Break {

    public static void main(String[] args) {

        //Break Statement

        for (int i = 0; i<10 ; i++){
            System.out.println("Printing value of i " +i);

            if (i==3){
                System.out.println("Printing value of i before breaking " +i);
                break;
            }
        }

        int j = 10;
        while (j>0){
            System.out.println("Value of j " +j);
            j--;
            if (j==5){
                break;
            }
        }







    }
}
