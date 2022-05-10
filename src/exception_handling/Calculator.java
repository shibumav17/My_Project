package exception_handling;

public class Calculator {
    public int divide (int a, int b){
        int result = 0;

        try {
            result = a / b;
        }
        catch(Exception e){
            System.out.println("CATCH BLOCK : Exception occurred...." + e);

            //System.exit(1);//finally will not get executed only when System.exit(1) is used
        }
        finally {
            System.out.println("FINALLY BLOCK : This will always execute ....");
        }
        return result;

    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Before method call...");
        int result = obj.divide(4,0);
        System.out.println("After method call...");
        System.out.println("output = " + result);
    }
}

//  Exception : it's an event which stops program's normal execution
//  Q: HOW CAN WE HANDLE EXCEPTION?
//  We can handle exception with try & catch.
//         try{
//            CODE
//          }
//         catch(Exception e) {
//          }
//   Features of try &  catch :
//   1- try without catch is not possible
//   2- atleast one try and one catch should be used to handle exception
//   3- with one try, we can have multiple catch but not vice-versa.
//
//   finally block : we can to execute code everytime whether exception occurr or not
//                    finally will always get executed
//
//   Catch Block :  will execute only when exception occurred
//
//   WHEN EXCEPTION OCCURRED ->
//   Before method call...
//   CATCH BLOCK : Exception occurred java.lang.ArithmeticException: / by zero
//   FINALLY BLOCK : This will always execute ....
//   After  method call...
//   output is ...0
//
//   WHEN EXCEPTION NOT OCCURRED ->
//   Before method call...
//   FINALLY BLOCK : This will always execute ....
//   After  method call...
//   output is ...2

