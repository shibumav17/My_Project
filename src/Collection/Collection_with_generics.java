package Collection;

import java.util.ArrayList;

public class Collection_with_generics {

    //method : Create an arraylist

    public void citylist(){
    // Collection <Data Type> var_name = new Collection<>();

        ArrayList <String> city = new ArrayList<>();
        city.add("Agra");
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Pune");


    // Advanced for loop : for (Datatype var_name : array/Collection){}
        for(String var : city){
            System.out.println("City names are : "+var);
        }
    }

    public void markslist(){
        ArrayList <Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(52);
        marks.add(67);
        for(Integer var : marks){
            System.out.println("Marks are : "+var);
        }
    }

    public ArrayList<Double> weightlist(){
        ArrayList <Double> weight = new ArrayList<>();
        weight.add(45.5);
        weight.add(56.4);
        weight.add(67.4);

        return weight;

    }

    public static void main(String[] args) {
    // step 1: create object
        Collection_with_generics obj = new Collection_with_generics();

    // step 2:  methodname();

        obj.citylist();
        obj.markslist();

        ArrayList<Double> output = obj.weightlist();
        for(Double var : output){
        System.out.println("Main Method - Weight list is :" +var);

    }
}
}
