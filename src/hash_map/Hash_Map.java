package hash_map;

import java.util.ArrayList;
import java.util.HashMap;

public class Hash_Map {

    public static void main(String[] args) {

        //SYNTAX : HashMap <Datatype_Key, Datatype_value> var_name = new HashMap<>();

        HashMap < Integer , ArrayList<String> > hashMap = new HashMap<>();

        //aaraylist syntax : ArrayList <data type> var_name = new collection<>();
        ArrayList <String> city = new ArrayList<>();
        city.add("Agra");
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Pune");
        hashMap.put(1, city);

        ArrayList <String> course = new ArrayList<>();
        course.add("Java");
        course.add("spring");
        course.add("springboot");
        hashMap.put(2,course);

        hashMap.get(1);//returns list of cities
        hashMap.get(2);// return course topics

        //advance for loop
        for (String var: hashMap.get(1)){
            System.out.println("City is : " +var);
        }
        for(String result : hashMap.get(2)){
            System.out.println("Course topic is : " +result);
        }

    }
}
