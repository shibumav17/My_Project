package conditional;

public class operator_and {
    public static void main(String[] args) {

        int age = 21;
        String city = "Agra";

        //operator TRUE & TRUE = TRUE
        if (age > 18 & city == "Agra"){
            System.out.println("TRUE & TRUE = TRUE: You are eligible for voting in Agra");
        }
        else {
            System.out.println("You are NOT eligible for voting in Agra");

        }

        // TRUE & FALSE = FALSE
        city = "Delhi";
        if (age > 18 & city == "Agra"){
            System.out.println("You are eligible for voting in Agra");
        }
        else {
            System.out.println("TRUE & FALSE = FALSE : You are NOT eligible for voting in Agra");
        }
        // FALSE & TRUE = FALSE
        age = 15; city = "Agra";
        if (age > 18 & city == "Agra"){
            System.out.println("You are eligible for voting in Agra");
        }
        else {
            System.out.println("FALSE & TRUE = FALSE : You are NOT eligible for voting in Agra");
        }

        // FALSE & FALSE = FALSE
        city = "Delhi";
        if (age > 18 & city == "Agra"){
            System.out.println("You are eligible for voting in Agra");
        }
        else {
            System.out.println("FALSE & FALSE = FALSE : You are NOT eligible for voting in Agra");
        }
        }
      }
