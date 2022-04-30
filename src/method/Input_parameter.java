package method;

public class Input_parameter {

    //SYNTAX : access_specifier return_type method_name (Datatype var1, Datatype var2,.....) {CODE}

    public String checkage (int age) {
        if (age >18){
            return "you are eligibe for voting";
        }
        else{
            return "you are not eligible for voting " ;
        }
    }

    public String hello(String name) {
        return "Welcome to input parameter :" +name;

    }

    public  int makesqaure(int number){
        return number*number;
    }

    public String test( String name, int age ){
        return "Welcome to input parameter : " +name  + " age : " +age ;

    }




    public static void main(String[] args) {
        Input_parameter obj = new Input_parameter();
        String result  = obj.checkage(21);
        System.out.println(result);

        result = obj.checkage(17);
        System.out.println("second data input: "+ result);

        System.out.println(obj.hello(" Shivam"));//without storing data or direct calling
        System.out.println(obj.hello(" Harshit"));//without storing data or direct calling

        result = obj.hello("Shibu");
        System.out.println("Calling name by input : "  + result);// with storing data


        int square = obj.makesqaure(15);
        System.out.println("Square of 15 is : " + square);// with storing data

        System.out.println("Square of 16 is : "+ obj.makesqaure(16));//without storing data or direct calling


        String test = obj.test("Harshit", 25);
        System.out.println(test);

        System.out.println(obj.test("Shibu", 25));

    }


}
