import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to check: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num + " is an even number.");
        }else{
            System.out.println(num + " is an odd number.");
        }
    }
}
