package OOPs;

public class Car extends Vehicle{
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelsCount = 4;
        obj.model = "BMW M4";
        obj.start();
    }
}
