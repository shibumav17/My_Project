package Collection.hash_set;

import model.Student_model;

import java.util.HashSet;

public class Student_set_hashcode {

    public HashSet<Student_model> createStudentSet(){

        //  Collection <DatType> VarName= New Collection<>();

        HashSet <Student_model> studentHashSet= new HashSet<>();

        Student_model student1= new Student_model("Rakesh",1,"IT");
        Student_model student4= new Student_model("Raj",1,"CS");
        Student_model student2= new Student_model("Rahul",2,"IT");
        Student_model student3= new Student_model("Mukesh",3,"CS");

        System.out.println("Hash code of student1 "+student1.hashCode());
        System.out.println("Hash code of student4 "+student4.hashCode());

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);

        return studentHashSet;

    }

    public static void main(String[] args) {

        Student_set_hashcode obj = new Student_set_hashcode();
        HashSet <Student_model> studentHashcode = obj.createStudentSet();

        System.out.println("Printing Size : " + studentHashcode.size());
        for (Student_model var : studentHashcode) {

            System.out.println("Printing name :" + var.getName() + " Rollno: " + var.getRollno() + " Section:" + var.getSection());
        }

    }
}
