package method;

public class Dog {
    String breedname;
    int age;
    // run ,eat, bark


/*TODO SYNTAX : access_specifier return_type method_name (parameter) {CODE}
       //access_specifier -> public, private, protected, default THEORY PART
       //return_type -> output of function or method : void : no return type
       //method_name -> can be anything : should be meaningful
       //parameter -> input parameter : optional */


    //Syntax : access_specifier return_type method_name (parameter) {CODE}

    public void runMethod(){
        System.out.println("This is runMethod of Dog class");
    }

    public void barkMethod(){
        System.out.println("This is barkMethod of Dog class");
    }

    public void eatMethod(){
        System.out.println("This is eatMethod of Dog class");
    }

    public static void main(String[] args) {
        Dog obj = new Dog();// 1= created object
        obj.runMethod();//2= objectname.Methodname();
        obj.barkMethod();
        obj.eatMethod();

    }

}


