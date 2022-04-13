package Loops_Working;

public class Demowhileloop {

    public static void main(String[] args) {

// While loop

        int i = 0 ;
        while (i<5){
            System.out.println("printing while loop " +i);

            i++ ;
        }

// Do While

        do {
            System.out.println("Inside Do while loop " + i);
            i-- ;
        }
        while (i>0);

    }
}
