// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;

class Main {
    public static void main(String[] args){
        ArrayList<String> shoppingList = new ArrayList<String>();
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");
    
        System.out.println(shoppingList);
        
        shoppingList.remove("Bread");
        shoppingList.add("Cheese");
        
        boolean hasMilk = shoppingList.contains("Milk");
        System.out.println("Shopping list have milk? " + hasMilk);
        
        System.out.println(shoppingList);
    }
}