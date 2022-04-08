package conditional;

public class If_else_statements {


    public static void main(String[] args) {

         int age = 25;
         if (age>21) {
             System.out.println("You are eligible for marriage");
         }
         else
         {
             System.out.println("You are NOT eligible for marriage");

         }

         String city = "Goa";

         if (city=="Agra") {
             System.out.println("You are in Agra city ");

         }
         else {
             System.out.println("You are not in Agra city");
         }

         double price = 20000;
         if (price>18000){
             System.out.println("Product is costly ");
         }
         else {
             System.out.println("Product is not costly");
         }

         if (age>21 & city == "Agra") {
             System.out.println("You are eligible for marriage");
         }
         else{
             System.out.println("You are  NOt eligible for marriage");

         }
    }
}
