package method;

public class Calc_with_Returntype {

    public int addition(){
        int a = 30;
        int b = 6;
        int sum = a+b;
        return sum;
    }
    public int subtraction (){
        int a = 50;
        int b = 39;
        int sub = a-b;
        return sub;
    }

    public int multiplication(){
        int a = 4;
        int b=30;
        int multiply = a*b;
        return multiply;
    }

    public int division(){
        int a =30;
        int b = 6;
        int division = a/b;
        return division;
    }

    public static void main(String[] args) {
        Calc_with_Returntype obj = new Calc_with_Returntype();
        int addition = obj.addition();
        System.out.println("Addition is : " + addition);

        int subtraction = obj.subtraction();
        System.out.println("Subtraction is : " + subtraction);

        int multiply = obj.multiplication();
        System.out.println("Multiplication is : " + multiply);

        int division = obj.division();
        System.out.println("Division is : " + division);

    }
}
