package Collection.array_list_demo;

    import model.Employee;

    import java.util.ArrayList;

    public class Employee_Array_List {

    public ArrayList<Employee> createEmployeeList() {

        //  Collection <DatType> VarName= New Collection<>();

        ArrayList <Employee> Employee_Array_List = new ArrayList<>();

        //data of employee;

        Employee employee1 = new Employee("Jayesh", 2973,"Food Security");
        Employee employee2 = new Employee("Uday",1212,"IT");
        Employee employee3 = new Employee("Bharat", 33232,"Finance");
        Employee employee4 = new Employee("Sunny", 2121,"Marketing");

        Employee_Array_List.add(employee1);
        Employee_Array_List.add(employee2);
        Employee_Array_List.add(employee3);
        Employee_Array_List.add(employee4);

        return Employee_Array_List;
    }

    public static void main(String[] args) {
        Employee_Array_List obj = new Employee_Array_List();
        ArrayList<Employee> Employee_Array_List = obj.createEmployeeList();

        //getter method :
        System.out.println("using  getter method:");

        for (Employee var : Employee_Array_List) {

            System.out.println("Name: " + var.getName() + " Id :" + var.getId() + " Department :" + var.getDepartment());
        }
        //Using setter method:
        System.out.println("using  setter method:");

        for (Employee var : Employee_Array_List) {
            if (var.getName() == "Jayesh") {
                var.setName("Jayesh Mathur");
            }
            if (var.getDepartment()=="IT") {
                var.setDepartment("Information Technology");
            }
            System.out.println("Name: " + var.getName() + " Id :" + var.getId() + " Department :" + var.getDepartment());
        }

    }
    }




