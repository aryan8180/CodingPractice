import java.util.Scanner;

class Main {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        printArray(arr);

        int min = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondSmallest = min;
                min = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != min) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Smallest element: " + min + ". No second smallest element (all elements are same).");
        } else {
            System.out.println("Smallest element: " + min + ". Second Smallest element: " + secondSmallest + ".");
        }

        scanner.close();
    }
}
