package Collection.array_list_demo;

import model.Student;

import java.util.ArrayList;

public class Student_Array_list {

    public ArrayList <Student> createStudentList() {

        // collection <data type> varname = new collection<>();

        ArrayList <Student> Student_Array_list = new ArrayList<>();

        // data of student : student 1,2,3;

        Student student1 = new Student ("Harshit", 17, "CE");
        Student student2 = new Student("Rajat", 32, "ME");
        Student student3 = new Student("Mukul", 35, "CS");

        Student_Array_list.add(student1);
        Student_Array_list.add(student2);
        Student_Array_list.add(student3);

        return Student_Array_list;

    }

    public static void main(String[] args) {
        Student_Array_list obj = new Student_Array_list();
        ArrayList <Student> Student_Array_List  = obj.createStudentList();

    //getter method :
        System.out.println("Using getter method :");

        for(Student var : Student_Array_List){

          //  System.out.println("Name :" +var.getName());
          //  System.out.println("Section :" +var.getSection());
          //  System.out.println("Roll no. :" +var.getRollno());
            System.out.println("Name: " +var.getName()+ " Branch: "+var.getSection()+ " Roll no.: "+var.getRollno());
        }

    //setter method :

        for(Student var: Student_Array_List){
            //changing name
            if(var.getName()=="Harshit"){
                var.setName("Harshit Chandel");
            }
            //changing section
            System.out.println("Using setter method :");
            if (var.getSection()=="CE"){
                var.setSection("Civil Engineering");
            }
            System.out.println("Name: " +var.getName()+ " Branch: "+var.getSection()+ " Roll no.: "+var.getRollno());

        }

    }
}
