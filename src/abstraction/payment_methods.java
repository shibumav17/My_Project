package abstraction;

//ASSIGNMENT

public class payment_methods extends Payment_abstraction{

    @Override
    public void gpay() {
        System.out.println("This is gpay method of payment");

    }

    @Override
    public void paytm() {
        System.out.println("This is paytm method of payment");
    }

    @Override
    public void phonepe() {
        System.out.println("This is phonepe method of payment");
    }

    public static void main(String[] args) {
        payment_methods obj = new payment_methods();
        obj.gpay();
        obj.paytm();
        obj.phonepe();
    }
}
