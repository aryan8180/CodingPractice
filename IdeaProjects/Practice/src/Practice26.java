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
        System.out.println("Enter the size of the Array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Entered element");
        printArray(arr);
        boolean ispalindrome = true;
        int start = 0;
        int end = size-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                ispalindrome = false;
                break;
            }else{
                start++;
                end--;
            }
        }
        System.out.print("The given array is palindrome? " + ispalindrome);
    }
}