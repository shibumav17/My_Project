package Collection.hash_map;

import java.util.HashMap;

public class HashMap_keySet {

    public static void main(String[] args) {

        //SYNTAX : HashMap <Datatype_Key, Datatype_value> var_name = new HashMap<>();

        // keySet() = it will return all the key in HashSet form

        HashMap<Integer, String> map = new HashMap<>();
        // put = keyword is used to add elements
        map.put(1, "Hero");
        map.put(2,"Honda");
        map.put(3,"Tvs");

        // get = keyword is used to get elements

        // keySet() = it will return all the key in HashSet form

        for (Integer var : map.keySet()){
            System.out.println("Printing Integer Map using keySet : " +map.get(var));
        }

        HashMap <String, String> obj = new HashMap<>();

        obj.put("a", "rajat");
        obj.put("b", "ashwin");
        obj.put("c", "harshit");
        // get = keyword is used to get elements

        // keySet() =  it will return all the key in HashSet form
        for (String output : obj.keySet()){
            System.out.println("Printing String obj using keySet : " +obj.get(output));
        }


    }
}


