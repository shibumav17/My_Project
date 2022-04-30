package class_and_object;

public class Employee {

    String name;
    String company;
    String department;
    String position;
    int age;
    double salary;
    int experience;


    public Employee(String name, String company, String department, String position, int age, double salary, int experience) {
        this.name = name;
        this.company = company;
        this.department = department;
        this.position = position;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
    }

    public static void main(String[] args) {

        // Syntax : Classname obj_name = new Classname(parameter 1, parameter2, parameter3, parameter4, .....);
        Employee obj = new Employee("Rajat", "IBM", "Software development", "Jr.Java developer",26, 50000.67,2);
        System.out.println("Employee name : " +obj.name);
        System.out.println("company : " +obj.company);
        System.out.println("department : " +obj.department);
        System.out.println("position : " +obj.position);
        System.out.println("age : " +obj.age);
        System.out.println("salary : " +obj.salary);
        System.out.println("experience : " +obj.experience);








    }
}
