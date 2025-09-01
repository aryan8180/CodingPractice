import java.util.Scanner;

public class Conditions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time: ");
        int time = sc.nextInt();

//        if(time >= 10 && time <= 17){
//            System.out.println("The office is open.");
//        }else{
//            System.out.println("The office is closed.");
//        }

        if(time == 12 || time == 18){
            System.out.println("It's snacks time");
        }else{
            System.out.println("It's time to work");
        }
    }
}
