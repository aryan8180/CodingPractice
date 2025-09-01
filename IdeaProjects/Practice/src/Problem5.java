import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers: ");

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        if(firstNumber>=secondNumber && firstNumber>=thirdNumber){
            System.out.println(firstNumber + " is the greatest number.");
        }else if(secondNumber>=firstNumber && secondNumber>=thirdNumber){
            System.out.println(secondNumber + " is the greatest number");
        }else{
            System.out.println(thirdNumber + " is the greatest number");
        }
    }
}
