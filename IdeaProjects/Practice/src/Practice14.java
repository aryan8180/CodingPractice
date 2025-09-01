public class Practice{
    public static void main(String[] args){
        Car c1 = new Car("Tesla","Cyber Truck",2022,2);
        c1.displayInfo();

        System.out.println();

        Vehicle v1 = new Vehicle("BMW","M3",2024);
        v1.displayInfo();

        System.out.println();

        Bike b1 = new Bike("Kawasaki","Ninja",2025,true);
        b1.displayInfo();

        System.out.println();

        ElectricCar e1 = new ElectricCar("Tata","Curve",2025,4,2000);
        e1.displayInfo();
    }

}

class Vehicle{
    String brand;
    String model;
    int year;

    Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo(){
        System.out.println("Brand: " + brand + " | Model: " + model + " | Year: " + year + ".");
    }
}

class Car extends Vehicle{
    int numDoors;

    Car(String brand, String model, int year, int numDoors){
        super(brand, model,year);
        this.numDoors = numDoors;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Bike extends Vehicle{
    boolean hasCarrier;

    Bike(String brand, String model, int year, boolean hasCarrier){
        super(brand,model,year);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

class ElectricCar extends Car{
    int batteryCapacity;

    ElectricCar(String brand, String model, int year, int numDoors, int batteryCapacity){
        super(brand, model, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity);
    }
}