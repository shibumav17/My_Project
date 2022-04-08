package conditional;

public class Not_operator {

    public static void main(String[] args) {

        int age = 21;
        //not operator
        if (!(age>17)){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("You are NOT eligible for voting");
        }
    }
}
