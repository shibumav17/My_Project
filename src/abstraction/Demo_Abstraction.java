package abstraction;

public abstract class Demo_Abstraction {

   //Syntax : access_specifier return_type method_name (parameter) {CODE/BODY}
   // abstraction : a method without method body is called abstraction
   // any class which is having atleast one abstract class will be declared as abstract class

   public abstract void m1();

   // we can also have normal method in abstract class

   public void m2(){
      System.out.println("This is normal method of abstract class");
   }

   //can we create object of abstract class? No, because there is no method implementation.So if we try to call
   //abstract method then JVM will not be able to find the code.

   public static void main(String[] args) {
      /*Demo_Abstraction obj = new Demo_Abstraction();
        obj.m1(); */
   }

}
