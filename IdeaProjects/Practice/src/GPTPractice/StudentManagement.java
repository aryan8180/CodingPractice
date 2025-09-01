package GPTPractice;

public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayDetails();
        System.out.println("Default");
        Student s2 = new Student(100,"Jarvo",88);
        s2.displayDetails();
        Student s3 = new Student(101,"Jarvo",98);
        s3.setName("Aryan");
        s3.setMarks(99);
        s3.displayDetails();
    }
}

class Student{
    private int id;
    private String name;
    private double marks;

    Student(){
        id = 0;
        name = "Unknown";
        marks = 0;
    }

    Student(int i, String n, double m){
        this.id = i;
        this.name = n;
        this.marks = m;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getMarks(){
        return marks;
    }

    public void setName(String naam){
        if(naam != null && !naam.trim().isEmpty()) {
            this.name = naam;
        }else{
            System.out.println("Invalid Name!");
        }
    }

    public void setMarks(double mark){
        if(mark>=0 && mark<=100){
            this.marks = mark;
        }else{
            System.out.println("Marks must be between 0 and 100!");
        }
    }

    public char calculateGrade(){
        if(this.marks>=90 && this.marks<=100){
            return 'A';
        }else if(this.marks>=75 && this.marks<=89){
            return 'B';
        }else if(this.marks>=50 && this.marks<=74){
            return 'C';
        }else{
            return 'F';
        }
    }



    void displayDetails(){
        System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks + " | Grade: " + calculateGrade() + ".");
    }


}
