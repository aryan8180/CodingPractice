import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements into the array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int mostFrequent = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most Frequent: " + mostFrequent + " with Frequency: " + maxFreq);
    }
}
