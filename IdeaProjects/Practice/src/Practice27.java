// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        printArray(arr);
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int secondLargest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>secondLargest && arr[i]!=max){
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest element: " + max + ". Second Largest element: " + secondLargest + ".");
    }
}