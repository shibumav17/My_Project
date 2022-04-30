package method;

public class Student_Method {

        String read;
        String play;
        String sleep;
        String eat;


/*TODO SYNTAX : access_specifier return_type method_name (parameter) {CODE}
       //access_specifier -> public, private, protected, default THEORY PART
       //return_type -> output of function or method : void : no return type
       //method_name -> can be anything : should be meaningful
       //parameter -> input parameter : optional */


        //Syntax : access_specifier return_type method_name (parameter) {CODE}
        public void readMethod(){

            System.out.println("I created read Method of Student1 Class");
        }

        public void playMethod(){

            System.out.println("This is a play Method of Student1 class");
        }

        public void sleepMethod(){
            System.out.println("This is Sleep Method of Student1 class");

        }

        public  void eatMethod(){

            System.out.println("This is eat Method of Student1 class");
        }

    public static void main(String[] args) {
        Student_Method  obj = new Student_Method();
        obj.playMethod();
        obj.eatMethod();
        obj.sleepMethod();
        obj.readMethod();
    }
}
