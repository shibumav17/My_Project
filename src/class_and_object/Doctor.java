package class_and_object;

public class Doctor {
    String name;
    String speciliasation;
    String degree;
    String Hospital_name;
    int age;
    double fee;
    int time;


    public Doctor(String name, String speciliasation, String degree, String hospital_name, int age, double fee, int time) {
        this.name = name;
        this.speciliasation = speciliasation;
        this.degree = degree;
        this.Hospital_name = hospital_name;
        this.age = age;
        this.fee = fee;
        this.time = time;
    }

    public static void main(String[] args) {
        // Syntax : Classname obj_name = new Classname(parameter 1, parameter2, parameter3, parameter4, .....);
        Doctor obj= new Doctor("C.P.Pal", "Ortho", "MBBS", "S.N.Hospital Agra",40,800.5,10);

        System.out.println("Doctor's name :" +obj.name);
        System.out.println("Doctor's speciliasation :" +obj.speciliasation);
        System.out.println("Degree: " +obj.degree);
        System.out.println("Hospital_name :" +obj.Hospital_name);
        System.out.println("age :" +obj.age);
        System.out.println("Fee :" +obj.fee);
        System.out.println("Time :" +obj.time);





    }
}
