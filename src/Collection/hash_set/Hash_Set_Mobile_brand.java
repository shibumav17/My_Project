package Collection.hash_set;

import java.util.HashSet;

    // ASSIGNMENT :

public class Hash_Set_Mobile_brand {

    // HashSet <Data Type> objname = new Hashset<>();

    //String data : Mobile brand name
    public HashSet <String> mobilebrand(){

        HashSet <String> brandname = new HashSet<>();
        brandname.add("Samsung");
        brandname.add("Apple");
        brandname.add("Realme");
        brandname.add("Samsung");
        brandname.add("Apple");

        System.out.println("Size of set : " +brandname.size());
        return brandname;
    }

    //Double data : Price list
    public HashSet <Double> pricelist(){

        HashSet<Double> pricelist = new HashSet<>();
        pricelist.add(24000.45);
        pricelist.add(30000.35);
        pricelist.add(40000.45);
        pricelist.add(24000.45);
        pricelist.add(30000.35);

        System.out.println("Size of set : " +pricelist.size());
        return pricelist;
    }

    //Integer data : Ram
    public HashSet <Integer> ram (){

        HashSet <Integer> ram = new HashSet<>();
        ram.add(24000);
        ram.add(22000);
        ram.add(15000);
        ram.add(22000);

        System.out.println("Size of set :" +ram.size());
        return ram;
    }

    public static void main(String[] args) {
        Hash_Set_Mobile_brand obj = new Hash_Set_Mobile_brand();

        HashSet <String> brandname = obj.mobilebrand();
        for(String var: brandname){
            System.out.println("Mobile brand name is : " +var);
        }

        HashSet<Double> pricelist  = obj.pricelist();
        for(Double output : pricelist){
            System.out.println("Price is : " +output);
        }

        HashSet <Integer> ram = obj.ram();
        for(Integer result : ram){
            System.out.println("Ram is : " +result);
        }

    }
}
