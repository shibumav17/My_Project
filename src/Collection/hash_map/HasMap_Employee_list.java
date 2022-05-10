package Collection.hash_map;

import model.Employee;

import java.util.HashMap;

public class HasMap_Employee_list {

    public static void main(String[] args) {

        HashMap<Integer, Employee> employeeinformationlisthashmap = new HashMap<>();

        Employee employee1 = new Employee("Jayesh", 2973,"Food Security");
        Employee employee2 = new Employee("Uday",1212,"IT");
        Employee employee3 = new Employee("Bharat", 33232,"Finance");
        Employee employee4 = new Employee("Sunny", 2121,"Marketing");

        employeeinformationlisthashmap.put(1,employee1);
        employeeinformationlisthashmap.put(2,employee2);
        employeeinformationlisthashmap.put(3,employee3);
        employeeinformationlisthashmap.put(4,employee4);

        //using keySet():

        System.out.println("Employee information using keySet :");

        for(Integer var: employeeinformationlisthashmap.keySet()){
            System.out.println("Name: " +employeeinformationlisthashmap.get(var).getName());
            System.out.println("Department: " + employeeinformationlisthashmap.get(var).getDepartment());
            System.out.println("Id: " +employeeinformationlisthashmap.get(var).getId());
        }


    }
}
