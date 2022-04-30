package class_and_object;

public class Student {
    String name;
    String age;
    String course;
    double height;
    double weight;

    public Student(String name, String age, String course, double height, double weight) {
        this.name = name;
        this.age = age;
        this.course= course;
        this.height = height;
        this.weight = weight;
    }

    public static void main(String[] args) {

        // Syntax : Classname obj_name = new Classname(parameter 1, parameter2, parameter3, parameter4, .....);

        Student obj1 = new Student("Harshit","Twenty five", "Java", 5.9, 67.5);

        System.out.println(" Student name : " + obj1.name);
        System.out.println(" Student age : " + obj1.age);
        System.out.println(" Student course : " + obj1.course);
        System.out.println(" Student height : " + obj1.height);
        System.out.println(" Student weight : " + obj1.weight);

        Student obj2 = new Student("Sharnya","Twenty Six", "Java 02", 5.3, 55.2);

        System.out.println(" Student name : " + obj2.name);
        System.out.println(" Student age : " + obj2.age);
        System.out.println(" Student course : " + obj2.course);
        System.out.println(" Student height : " + obj2.height);
        System.out.println(" Student weight : " + obj2.weight);


    }
}
