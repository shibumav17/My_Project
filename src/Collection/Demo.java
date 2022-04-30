package Collection;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //normal way
        String city1 = "Agra";
        String city2 = "Delhi";
        String city3 = "Noida";
        String city4 = "Gurugram";

        //Collection way: Collection_Name Var_Name= new Collection_Name();

        ArrayList citylist = new ArrayList();

        citylist.add("Agra");
        citylist.add("Delhi");
        citylist.add("Noida");
        citylist.add("Gurugram");

        System.out.println("Printing city names : " +citylist.get(0));
        System.out.println("Printing city names : " +citylist.get(1));
        System.out.println("Printing city names : " +citylist.get(2));
        System.out.println("Printing city names : " +citylist.get(3));

        //for loop

        for(int i = 0 ; i<citylist.size(); i++){
            System.out.println("Printing city names using for loop at index  " +i + ": " +citylist.get(i));
        }

        //Advanced for loop : for (Datatype var_name : array/Collection){}

        for (Object var : citylist){
            System.out.println("Printing city names using advanced loop : " +var);
        }

        //removing data from arrrayList

        System.out.println("Printing before removing :" +citylist.get(1));
        citylist.remove(1);
        System.out.println("Printing after removing : " +citylist.get(1));

        for(int i = 0 ; i<citylist.size(); i++){
            System.out.println("Printing city names using for loop at index  " +i + ": " +citylist.get(i));
        }

    }
}
