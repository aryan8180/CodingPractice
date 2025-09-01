public class ProblemsOnArray {
    public static void main(String[] args){

        int numbers[] = {23, 12, 6, 7, 15, 3, 2, 56};
//        int sum = 0;
//
//        for(int number: numbers){
//            sum += number;
//        }
//
//        System.out.println("Sum is: " + sum);

//        int min = Integer.MAX_VALUE;
//        for(int number: numbers){
//            if(number<min){
//                min = number;
//            }
//        }
//
//        System.out.println("Minimum number is: " + min);

//        Row = Student Roll Number
//        Column = Subject Position
        int marks[][] = {
                {12,98,67},
                {15,64,44},
                {55,76,45},
                {65,44,78}
        };

        System.out.println(marks[2][0]);
        System.out.println(marks[1][2]);
        System.out.println(marks[0][1]);
    }
}
