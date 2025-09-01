import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scenner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
    }
}
