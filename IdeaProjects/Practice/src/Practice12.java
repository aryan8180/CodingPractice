public class Practice {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.managerDetails(101, "Alice", 70000, 8);
        m1.displayManagerDetails();

        System.out.println();

        Developer d1 = new Developer();
        d1.developerDetails(102, "Bob", 50000, "Java");
        d1.displayDeveloperDetails();
    }
}


class Employee{
    int id;
    String name;
    double salary;

    void displayDetails(){
        System.out.println("ID: " + id + " | Name: " + name + " | Salary: " + salary + ".");
    }
}

class Manager extends Employee{
    int teamSize;

    void managerDetails(int id, String name, double salary, int teamSize){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.teamSize = teamSize;
    }
    void displayManagerDetails(){
        displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee{
    String programmingLanguage;

    void developerDetails(int id, String name, double salary, String programmingLanguage){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloperDetails(){
        displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);

    }

}