package Collection.hash_set;

import java.util.HashSet;


    // ASSIGNMENT :

public class Hash_Set_Employee {

    // HashSet <Data Type> objname = new Hashset<>();

    public HashSet <String> namelist (){

    HashSet <String> name = new HashSet<>();
    name.add("ram");
    name.add("rishabh");
    name.add("ravi");
    name.add("ram");
    name.add("ravi");

    System.out.println("size of set: " +name.size());
    return name;
    }

    public HashSet<Double> salarylist(){

        HashSet <Double> salary = new HashSet<>();
        salary.add(20000.12);
        salary.add(23000.15);
        salary.add(19000.25);
        salary.add(23000.15);
        salary.add(19000.25);

        System.out.println("Size of set: " +salary.size());
        return salary;
    }

    public HashSet<Integer> agelist(){

        HashSet <Integer> age = new HashSet<>();
        age.add(23);
        age.add(27);
        age.add(22);
        age.add(22);
        age.add(27);

        System.out.println("Size of set: " +age.size());
        return  age;
    }

    public static void main(String[] args) {

        Hash_Set_Employee obj = new Hash_Set_Employee();

        HashSet <String> name = obj.namelist();
        for(String var: name){
            System.out.println("Name is: " +var);
        }

        HashSet <Double> salary = obj.salarylist();
        for(Double output : salary){
            System.out.println("salary is: "+output);
        }

        HashSet <Integer> age = obj.agelist();
        for(Integer result: age){
            System.out.println("Age is  : "+result);
        }

    }

}

