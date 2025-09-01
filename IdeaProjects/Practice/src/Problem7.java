import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int start = 0;
        int end = name.length()-1;
        boolean isPalindrome = true;

        while(start<end){
            if(name.charAt(start)!=name.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(isPalindrome);
        sc.close();
    }
}
