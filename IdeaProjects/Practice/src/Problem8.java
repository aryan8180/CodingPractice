import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age[]; // Declaration the Array named age
        age = new int[20]; //Allocating memory to the array

        age[0] = 5;
        age[1] = 2;
        age[2] = 23;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age.length);

        String[] names = {"Aryan","Jarvo","Happy","Deansarous"};
        for(String name : names){
            System.out.println(name);
        }
    }
}
