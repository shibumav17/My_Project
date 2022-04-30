package method;

import java.util.Scanner;

    public class By_sir_calcii {


    /*TODO  Syntax : access_specifier return_type  method_name (parameter) {CODE}
        //access_specifier -> public , private , protected, default   THEORY PART
         //return_type   -> output of function or method :  void : no return type
         //method_name -> can be anything: it should be meaningful
           // parameter ->  input parameter : optional */

        // add sub mult divide
        //Syntax : access_specifier return_type  method_name (parameter) {CODE}

        public void addition(){

            Scanner scanner= new Scanner(System.in);
            System.out.println("Please enter Value of a: ");
            int a=scanner.nextInt();
            System.out.println("Please enter Value of b: ");
            int b=scanner.nextInt();
            int sum=a+b;

            System.out.println("Addition is :"+sum);

        }

        public void subtraction(){

            Scanner scanner= new Scanner(System.in);
            System.out.println("Please enter Value of a: ");
            int a=scanner.nextInt();
            System.out.println("Please enter Value of b: ");
            int b=scanner.nextInt();
            int sub=a-b;

            System.out.println("Subtraction is :"+sub);
        }

        // multi  a*b
        // divide a/b

        public static void main(String[] args) {
            //1 create Object
            By_sir_calcii obj= new By_sir_calcii();
            Scanner obj2= new Scanner(System.in);

            String flag="Y";

            while (flag.equals("Y")) {

                System.out.println("Please enter your choice : 1 for add, 2 sub, 3 for multiply and 4 for divide");
                int choice= obj2.nextInt();
                if(choice==1){
                    obj.addition();
                }
                else  if (choice==2){
                    obj.subtraction();
                }
                Scanner loopscanner= new Scanner(System.in);
                System.out.println("Please enter N to Exit or Y to continue ...");
                flag= loopscanner.nextLine();
            }



        }

    }


