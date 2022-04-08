package conditional;

public class Nested_or_operator {

    public static void main(String[] args) {
        int age = 21;
        String city = "Agra";
        // TRUE || TRUE = TRUE
        if (age > 18 || city == "Agra"){
            System.out.println("TRUE || TRUE = TRUE: You are eligible for voting in Agra");
        }
        else {
            System.out.println("You are NOT eligible for voting in Agra");
        }

        // TRUE || FALSE = TRUE
        city = "Delhi";
        if (age > 18 || city == "Agra"){
            System.out.println("TRUE || FALSE = TRUE : You are eligible for voting in Agra");
        }
        else {
            System.out.println("You are NOT eligible for voting in Agra");
        }
        // FALSE || TRUE = TRUE
        age = 17;
        city = "Agra";
        if (age > 18 || city == "Agra"){
            System.out.println("FALSE || TRUE = TRUE : You are eligible for voting in Agra");
        }
        else {
            System.out.println("You are NOT eligible for voting in Agra");
        }

        //FALSE || FALSE = FALSE
        age = 17; city = "Delhi";
        if (age > 18 || city == "Agra"){
            System.out.println("You are eligible for voting in Agra");
        }
        else {
            System.out.println("FALSE || FALSE = FALSE : You are NOT eligible for voting in Agra");
        }

    }
}
