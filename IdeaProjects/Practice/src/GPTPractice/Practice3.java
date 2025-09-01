package GPTPractice;

public class Practice3 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Cody Banks","IT",2500000);
        Employee e2 = new Employee(2,"John Cena","Marketing",3500000);
        Employee e3 = new Employee();

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }

}

class Employee{
    int id;
    String name;
    String department;
    double salary;

    Employee(){
        id = 0;
        name = "Unknown";
        department = "Unknown";
        salary = 0.0;
    }

    Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Employee ID: " + id + " | Employee Name: " + name + " | Department: " + department + " | Salary: " + salary);
    }
}
