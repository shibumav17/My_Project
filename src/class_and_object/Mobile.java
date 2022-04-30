package class_and_object;

public class Mobile {

    //PROPERTIES or Data MEMBER

    //name
    String name = "RealmeX";
    //company
    String company = "Realme";
    //price
    int price= 20000;
    //year
    int year = 2019;
    //Android name
    String Android_name = "Eleven";
    //Battery capacity
    String battery_capacity = "four thousand mah";
    //ram
    int ram = 8;
    //processor;
    String processor = "Snapdragon Seven ten";
    //camera
    int camera = 48;

    public static void main(String[] args) {

        //Syntax : ClassName obj_name = new Classname();
        //use object to access data member : obj_name.property_name;

        Mobile m1 = new Mobile();
        System.out.println(m1.name);
        System.out.println(m1.company);
        System.out.println(m1.price);
        System.out.println(m1.Android_name);
        System.out.println(m1.year);
        System.out.println(m1.battery_capacity);
        System.out.println(m1.ram);
        System.out.println(m1.camera);

    }


}
