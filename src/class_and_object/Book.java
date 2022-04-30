package class_and_object;

public class Book {


    //PROPERTIES OR DATA MEMBER OR MEMBER FUNCTION
    //name
    String name = "Java";

    //writer
    String writer = "Games Gosling";

    //pages
    int pages = 100;

    //price
    double price = 600.25;


    public static void main(String[] args) {

        //Syntax : ClassName obj_name = new Classname();
        //use object to access data member : obj_name.property_name;

        Book book1 = new Book();
        System.out.println(book1.name);
        System.out.println(book1.writer);
        System.out.println(book1.pages);
        System.out.println(book1.price);


        Book book2 = new Book();
        book2.name = "The Fountainhead";
        book2.writer = "Ayn Rand";
        book2.pages = 700;
        book2.price = 900.50;

        System.out.println(book2.name);
        System.out.println(book2.writer);
        System.out.println(book2.pages);
        System.out.println(book2.price);










    }


}
