package GPTPractice;

public class Constructor {
    public static void main(String[] args) {
        StudentResult s1 = new StudentResult();
        s1.displayDetails(); // Will display default constructor details

        StudentResult s2 = new StudentResult("Jarvo", 22, 'A');
        s2.displayDetails();
    }
}

class StudentResult {
    String name;
    int age;
    char grade;

    StudentResult(){
        System.out.println("Default constructor called!");
        name = "Unknown";
        age = 0;
        grade = 'U';
    }

    StudentResult(String n, int a, char b){
        System.out.println("Parameterized constructor called!");
        name = n;
        age = a;
        grade = b;
    }

    void displayDetails() {
        System.out.println("Name: " + name + " | Age: " + age + " | Grade: " + grade);
    }
}
