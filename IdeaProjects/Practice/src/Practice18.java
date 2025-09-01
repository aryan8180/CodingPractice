import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students you want to enter: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details for student " + (i+1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Roll Number: ");
            int rollNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(name, rollNumber, marks);
        }

        System.out.println("Students Entered:");
        for(Student student:students){
            student.displayInfo();
        }

        sc.close();

    }
}

class Student{
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayInfo(){
        System.out.println("Name: " + name + " | Roll Number: " + rollNumber + " | Marks: " + marks);
    }
}