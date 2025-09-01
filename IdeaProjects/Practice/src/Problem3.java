import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("The sum of the two numbers = " + (firstNumber+secondNumber));
        System.out.println("The difference of the two numbers = " + (firstNumber-secondNumber));
        System.out.println("The product of the two numbers = " + (firstNumber*secondNumber));
        System.out.println("The quotient of the two numbers = " + (firstNumber/secondNumber));
    }
}
