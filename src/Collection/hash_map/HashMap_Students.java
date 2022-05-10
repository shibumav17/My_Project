package Collection.hash_map;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap_Students {

    public static void main(String[] args) {
        //SYNTAX : HashMap <Datatype_Key, Datatype_value> var_name = new HashMap<>();

        HashMap< Integer , Student > studentHashMap = new HashMap<>();

        Student student1 = new Student ("Harshit", 17, "CE");
        Student student2 = new Student("Rajat", 32, "ME");
        Student student3 = new Student("Mukul", 35, "CS");

        studentHashMap.put(1,student1);
        studentHashMap.put(2,student2);
        studentHashMap.put(3,student3);

        for( Integer var : studentHashMap.keySet()){
            System.out.println("Printing student data using keySet : " +studentHashMap.get(var).getName() + " Roll no : "+ studentHashMap.get(var).getRollno());
        }

        HashMap<String, ArrayList<Student>> stringArrayListHashMap = new HashMap<>();

        ArrayList <Student> kpitstudents = new ArrayList<>();
        Student stu1 = new Student ("Harshit", 17, "CE");
        Student stu2 = new Student("Rajat", 32, "ME");
        Student stu3 = new Student("Mukul", 35, "CS");

        kpitstudents.add(stu1);
        kpitstudents.add(stu2);
        kpitstudents.add(stu3);

        stringArrayListHashMap.put("KPIT", kpitstudents);

        for(Student var: stringArrayListHashMap.get("KPIT")){
            System.out.println("KPIT Student data : " + var.getName() +" Section " +var.getSection()) ;
        }

        ArrayList <Student> hindustantudents = new ArrayList<>();
        Student studs1 = new Student ("divya", 23, "ME");
        Student studs2 = new Student("drishti", 45, "cs");
        Student studs3 = new Student("Shivam", 65, "IT");

        hindustantudents.add(studs1);
        hindustantudents.add(studs2);
        hindustantudents.add(studs3);

        stringArrayListHashMap.put("HCST", hindustantudents);

        for (Student output : stringArrayListHashMap.get("HCST")){
            System.out.println("HCST Student data : "+output.getName()+ " Section :"+output.getSection());
        }

    }
}
