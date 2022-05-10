package exception_handling;

public class Age_Custom_Exception {

    public String voting_eligibility(int age) throws Min_Age_Custom_Exception {

        if (age<18){
            throw new Min_Age_Custom_Exception("You are not eligible for voting as your age is less than 18");
        }
        else{
            return "You are eligible for voting";
        }
    }

    public static void main(String[] args) {
        Age_Custom_Exception obj = new Age_Custom_Exception();
        try {
            System.out.println(obj.voting_eligibility(19));
        } catch (Min_Age_Custom_Exception e) {
            e.printStackTrace();
        }
    }
}
