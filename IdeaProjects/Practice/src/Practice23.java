// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String sentence = sc.nextLine();
        
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = sentence.split(" ");
        
        for(String word: words){
            word = word.toLowerCase();
            if(wordCount.containsKey(word)){
                int count = wordCount.get(word);
                wordCount.put(word, count+1);
            }else{
                wordCount.put(word,1);
            }
        }
        
        System.out.println(wordCount);
    }
}