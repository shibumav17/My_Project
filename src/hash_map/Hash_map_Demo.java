package hash_map;

import java.util.HashMap;

public class Hash_map_Demo {

    public static void main(String[] args) {

        //SYNTAX : HashMap <Datatype_Key, Datatype_value> var_name = new HashMap<>();

        HashMap <Integer, String>  map = new HashMap<>();

        // put = keyword is used to add elements

        map.put(1, "Hero");
        map.put(2,"Honda");
        map.put(3,"Tvs");

        // get = keyword is used to get elements

        System.out.println("value of 1st key : " +map.get(1));
        System.out.println("value of 2nd key : " +map.get(2));
        System.out.println("value of 3rd key : " +map.get(3));

        HashMap <String, String> obj = new HashMap<>();

        obj.put("a", "rajat");
        obj.put("b", "ashwin");
        obj.put("c", "harshit");

        System.out.println("value of 1st key : "+obj.get("a"));
        System.out.println("value of 3rd key : "+obj.get("c"));
        System.out.println("value of 2nd key : " +obj.get("b"));

    }
}
