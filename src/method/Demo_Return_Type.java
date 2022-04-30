package method;

public class Demo_Return_Type {

    public String Message(){
        String msg = "This is a return type  example ";
        return msg;
    }

    public int getage(){
        int age = 25;
        return age;
    }

    public double getsalary(){
        double salary = 50000.50;
        return salary;

    }

    public static void main(String[] args) {
        Demo_Return_Type obj = new Demo_Return_Type();
        String print = obj.Message();
        System.out.println("Print :" +print);

        int age = obj.getage();
        System.out.println("Age is :" +age);

        double salary = obj.getsalary();
        System.out.println("Salary is : " +salary);


    }
}
