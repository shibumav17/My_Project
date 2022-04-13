package array;

public class Demo_Array {
    public static void main(String[] args) {
        // Arrray
        // Data Type [] var = {element 1,2,3,4....};

        int [] marks = {45,56,42,55,78,54,12,34};

        System.out.println("printing array with var ;" + marks[3]);


        for (int i = 0 ; i< marks.length; i++){
            System.out.println(" printing For loop: aaray with var ;" +marks[i]);
        }

        //Advanced for loop ( for datatype var_name = array)


        for (int var : marks){
            System.out.println(" printing Advanced loop with array :" +var);
        }

        String [] cities = {"Agra","New york", "stockholm", "geneva", "mumbai", "pune", "Munich"};

        for (String nameofcities : cities){
            System.out.println("printing city names with advanced loop :" +nameofcities);
        }


    }
}
