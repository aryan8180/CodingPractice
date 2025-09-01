public class Array {
    public static void main(String[] args){
        int intArray[]; // Declaration
        intArray = new int[20]; // allocating memory to array

        intArray[0] = 5;
        intArray[1] = 10;
        intArray[2] = 15;

//        System.out.println(intArray[0]);
//        System.out.println(intArray[1]);
//        System.out.println(intArray[2]);
//        System.out.println(intArray.length);

        int marks[] = {98, 12, 45, 12, 65};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int mark: marks){
            if(mark < min){
                min = mark;
            }
            if(mark > max){
                max = mark;
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
