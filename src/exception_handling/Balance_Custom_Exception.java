package exception_handling;

public class Balance_Custom_Exception {

    public String open_account(double amount) throws Min_Balance__Custom_Exception {

        if (amount<5000){
            throw new Min_Balance__Custom_Exception("Minimum balance required to open a account is Rs.5000");
        }
        else{
            return "Your account has opened successfully";
        }
    }

    public static void main(String[] args) {
        Balance_Custom_Exception obj = new Balance_Custom_Exception();
        try {
            System.out.println(obj.open_account(6000));
        } catch (Min_Balance__Custom_Exception e) {
            e.printStackTrace();
        }
    }
}
