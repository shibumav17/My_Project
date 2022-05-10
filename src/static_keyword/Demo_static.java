package static_keyword;

public class Demo_static {

    public static String name; //Static data
    public String city;//non static data = it will be available after object creation

    public static void m1(){
        System.out.println("This is m1 method of static keyword");
        System.out.println("Static data: " +name);
        //System.out.println("Non-static data: " +city); //not allowed
      }

      //Static method
    public static void main(String[] args) {
        //static keyword: we can call method directly without creating the object.
        //Syntax : ClassName.MethodName();

        Demo_static.m1();

        System.out.println("Printing name with static method " + Demo_static.name);
    }
}
    //Q1.Can we override static method?
    //No, we can not override static method because overriding is runtime polymorphism
    //and runtime polymorphism depends on object creation.This means that if there is no object then
    //runtime polymorphism won't happen.
    //Since static method does not depend on object.So we do NOT create any object
    //and hence overriding is not possible.

    //Q2.Can we use a non-static data inside a static method?
    //No, we can not use a non-static data inside a static method because non-static data is always part
    //of object & it is only available after creating the object.But in Static method, we never create
    //the object to call the method.

    //Q3.Our main method is always static(psvm).Then who calls it?
    //Yes, our main method is always static because JVM calls this method.
    //JVM calls this main method without creating any object.

