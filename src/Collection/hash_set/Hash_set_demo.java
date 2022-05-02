package Collection.hash_set;

import java.util.HashSet;

public class Hash_set_demo {

    // HashSet <Data Type> objname = new Hashset<>();

    //String data type :
    public HashSet <String> CreateStringSet(){

        HashSet <String> course = new HashSet<>();
        course.add("Java");
        course.add("Java");
        course.add("Spring");
        course.add("Springboot");
        course.add("Spring");

        System.out.println("Size of course set: " +course.size());
        return course;
    }

    //Integer data type :
    public HashSet <Integer> CreateIntSet() {
        HashSet <Integer> marks = new HashSet<>();
        marks.add(33);
        marks.add(35);
        marks.add(37);
        marks.add(33);
        marks.add(37);

        System.out.println("Size of marks set :" +marks.size());
        return marks;
    }

    //double data type :
    public HashSet <Double> CreateDoubleSet(){
        HashSet <Double> weight = new HashSet<>();
        weight.add(30.4);
        weight.add(45.6);
        weight.add(67.9);
        weight.add(30.4);
        weight.add(45.6);
        weight.add(67.9);

        System.out.println("Size of weight set: " +weight.size());
        return weight;
    }

    public static void main(String[] args) {
        Hash_set_demo obj = new Hash_set_demo();
        HashSet <String> course = obj.CreateStringSet();
        for(String var: course){
            System.out.println("Printing course : "+var);
        }

        HashSet <Integer> marks = obj.CreateIntSet();
        for(Integer output : marks){
            System.out.println("Printing marks: "+output);
        }

        HashSet <Double> weight =  obj.CreateDoubleSet();

        for(Double result : weight){
            System.out.println("Printing weight : " +result);
        }

    }

}
