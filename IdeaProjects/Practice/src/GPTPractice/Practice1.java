package GPTPractice;

public class Practice1 {
    public static void main(String[] args) {
        StudentConstructor s1 = new StudentConstructor();
        s1.name = "Jarvo";
        s1.age = 21;
        s1.grade = 'A';

        Student s2 = new Student();
        s2.name = "Jordan";
        s2.age = 22;
        s2.grade = 'B';

        s1.displayDetails();
        s2.displayDetails();
    }
}

class StudentConstructor{
    //Properties as Variable
    String name;
    int age;
    char grade;

    void displayDetails() {
        System.out.println("Name of the Student: " + name + ", Age: " + age + ", Grade Received: " + grade + ".");
    }
}
