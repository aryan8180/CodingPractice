// Parent class
class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + " | Year: " + year);
    }
}

// Child class Car
class Car extends Vehicle {
    int doors;

    Car(String brand, int year, int doors) {
        super(brand, year); // call parent constructor
        this.doors = doors;
    }

    void displayCar() {
        displayInfo(); // method from Vehicle
        System.out.println("Doors: " + doors);
    }
}

// Child class Bike
class Bike extends Vehicle {
    boolean hasCarrier;

    Bike(String brand, int year, boolean hasCarrier) {
        super(brand, year);
        this.hasCarrier = hasCarrier;
    }

    void displayBike() {
        displayInfo();
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2020, 4);
        c1.displayCar();

        Bike b1 = new Bike("Honda", 2019, true);
        b1.displayBike();
    }
}
