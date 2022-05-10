package final_Keyword;

public final class Demo_final_keyword {

    public static void main(String[] args) {
         final String name = "Mohit";
        System.out.println("Before change " +name);
        //name = "Java";
        // final class : final class can not be extended or
        //we can not make any changes in variable if the class is declared final

        System.out.println("After change " +name);
    }

    //a method

    final public void m1(){
        System.out.println("This is m1");
    }
}
