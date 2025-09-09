// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int data[] = {2,5,8,1,9,4,3,7};
        double sum = 0;
        for(int i=0;i<data.length;i++){
            sum += data[i];
        }
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + sum/data.length);
    }
}