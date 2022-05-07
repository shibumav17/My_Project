package polymorphism;

public class Method_Overloading {

    // Syntax : access_specifier return_type  method_name (parameter) {CODE}

    //  Method OverLoading : same method with different input parameter
    //  Compile time Polymorphism: It is called Compile time Polymorphism because in compile time only it is
    //   decided which method will get called

    public void hellostudent(){
        System.out.println("Hello student, welcome to Method overloading");
    }

    //overloading :

    public void hellostudent(String name){
        System.out.println("Hello Student, welcome to method overloading: " +name);
    }

    public void hellostudent(String name, Integer age){
        System.out.println("Hello Student, welcome to method overloading: " +name + " AGE:  " + age);
    }

    public static void main(String[] args) {
        Method_Overloading obj = new Method_Overloading();
        obj.hellostudent();
        obj.hellostudent("Harshit");
        obj.hellostudent("Rajat", 26);
    }

}
