package class_and_object;

public class Book_Parameterized_Constructor {

    String name;
    String writer;
    int pages;
    double price;

    // Parameterized Constructor:


    public Book_Parameterized_Constructor(String name, String writer, int pages, double price) {
        this.name = name;
        this.writer = writer;
        this.pages = pages;
        this.price = price;

    }

    public static void main(String[] args) {

     // Syntax : Classname obj_name = new Classname(parameter 1, parameter2, parameter3, parameter4, .....);

        Book_Parameterized_Constructor obj = new Book_Parameterized_Constructor("Fountainhead", "Ayn Rand", 700, 980.50);

        System.out.println("Book name : " + obj.name);
        System.out.println("Writer name : " +obj.writer);
        System.out.println("Pages : " +obj.pages);
        System.out.println("Price : " +obj.price);

        Book_Parameterized_Constructor obj2 = new Book_Parameterized_Constructor("Atlas Shrugged", "Ayn Rand", 1200, 1500.80);
        System.out.println("Book name : " + obj2.name);
        System.out.println("Writer name : " +obj2.writer);
        System.out.println("Pages : " +obj2.pages);
        System.out.println("Price : " +obj2.price);


    }
}
