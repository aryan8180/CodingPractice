// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;

class Main {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        
        System.out.println(numbers);
        
        for(int i=numbers.size()-1;i>=0;i--){
            int currentNumber = numbers.get(i);
            if(currentNumber%2==0){
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
        
    }
}