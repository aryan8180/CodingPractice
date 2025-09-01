import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int newNum = 0;
        System.out.println("Before: " + num);

        while(num>0){
            int ld = num%10;
            newNum = newNum*10 + ld;
            num = num / 10;
        }

        System.out.println("After: " + newNum);
    }
}
