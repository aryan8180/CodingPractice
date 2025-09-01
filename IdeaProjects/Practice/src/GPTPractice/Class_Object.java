package GPTPractice;

public class Class_Object {
    public static void main(String[] args) {
        // Creating Objects
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.color = "Black";
        car1.year = 1;

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.color = "Blue";
        car2.year = 2;

        car1.drive();
        car1.honk();
        car1.showDetails();
        car1.honk();
        car2.drive();
        car2.honk();
        car2.showDetails();
        car1.honk();
    }
}

class Car {
    // Properties are Variables
    String brand;
    String color;
    int year;

    // Behavior (method)
    void drive() {
        System.out.println(brand + " is driving...");
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", Color: " + color + ", Year(s) used: " + year);
    }

    void honk() {
        System.out.println("Beep Beep!");
    }
}
