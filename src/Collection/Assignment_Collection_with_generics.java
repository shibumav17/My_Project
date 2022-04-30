package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Assignment_Collection_with_generics {

    //method : Create an array list

    public ArrayList<String> Mobilebrandsname(){
        ArrayList <String> mobile = new ArrayList<>();
        mobile.add("apple");
        mobile.add("samsung");
        mobile.add("redmi");
        mobile.add("realme");
        mobile.add("motorolla");
         return mobile;

    }

    public ArrayList<Integer> distancelist(){
        ArrayList <Integer> distance = new ArrayList<>();
        distance.add(500);
        distance.add(230);
        distance.add(400);
        distance.add(370);

        return distance;
    }

    public ArrayList<Double> Salarylist(){
        ArrayList<Double> salary = new ArrayList<>();
        salary.add(40000.56);
        salary.add(70000.45);
        salary.add(24000.45);
        salary.add(4500.454);

        return salary;
    }

    public static void main(String[] args) {
        Assignment_Collection_with_generics obj = new Assignment_Collection_with_generics();

        ArrayList<String> output = obj.Mobilebrandsname();
        for( String var : output){
            System.out.println("Name of Mobile brand :" +var);
        }



        ArrayList<Integer>  result = obj.distancelist();
        for (Integer var: result){
            System.out.println("Ditance is : "+var);
        }

        ArrayList<Double> rem =  obj.Salarylist();
        for(Double var: rem){
            System.out.println("Salary is: "+var);
        }

    }

}
