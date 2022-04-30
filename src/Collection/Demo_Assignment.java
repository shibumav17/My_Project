package Collection;

import java.util.ArrayList;

public class Demo_Assignment {

    public static void main(String[] args) {

        //Collection_Name Var_Name= new Collection_Name();

        ArrayList course = new ArrayList();


        course.add("core java");
        course.add("advance java");
        course.add("css");
        course.add("javascript");
        course.add("framework");
        course.add("springboot");
        course.add("interview preparation");

        //for loop
        System.out.println("Printing with for loop :");
        for (int i = 0; i<course.size(); i++){
            System.out.println("At index " +i + " :" +course.get(i));
        }

        //Advanced for loop : for (Datatype var_name : array/Collection){}
        System.out.println("Printing with Advvanced loop: ");
        for (Object var : course){
            System.out.println("course index :" +var);
        }

        //removing data from arrayList

        course.remove(2);
        System.out.println("Printing after removing data: ");
        for (int i = 0; i<course.size(); i++){
            System.out.println("At index " +i + " :" +course.get(i));
        }

    }
}
