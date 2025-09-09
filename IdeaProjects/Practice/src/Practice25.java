// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Entered elements: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("Enter the element you want to check:");
        int askNumber = scanner.nextInt();
        int count = 0;
        for(int i=0;i<size;i++){
            if(askNumber==arr[i]){
                count++;
            }
        }
        System.out.println("Specified Number: " + askNumber + " appeared " + count + " number of times.");
    }
}