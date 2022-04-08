package conditional;

public class Greater_than_or_equal {

    public static void main(String[] args) {
        int age = 18;
        if  (age>=18){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("You are not eligible for voting");
        }

        age =21;
        if (age<=21){
            System.out.println("You are not eligible for marrriage");
        }
        else{
            System.out.println("You are eligible for marrriage");

        }
    }
}
