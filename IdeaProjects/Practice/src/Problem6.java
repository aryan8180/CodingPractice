import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number here: ");
        int num = sc.nextInt();

        int fact = 1;
        for(int i=num;i>0;i--){
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is " + fact);
    }
}
