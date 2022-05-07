package polymorphism;

public class DemoB extends DemoA_Method_Overriding {

    public void m2(){
        System.out.println("This is M2 method of DemoB");
    }

    //Runtime: in runtime whatever object you are creating, it will call that method only.

    public static void main(String[] args) {
        DemoA_Method_Overriding obj= new DemoA_Method_Overriding();
        obj.m1();

        DemoA_Method_Overriding obj1 = new DemoB();
        obj.m1();

      /*  // child can not hold object of Parent
        DemoB obj3= new DemoA();// compile time error because child can not hold parent object.
        obj.m1();*/

    }

}
