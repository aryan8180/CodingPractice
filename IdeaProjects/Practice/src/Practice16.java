// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla", 2024);
        Car c2 = new Car("BMW", 2002);

        Car[] cars = {c1,c2};

        for(Car car:cars){
            car.displayDetail();
        }
    }
}

class Car{
    String brand;
    int year;

    Car(String brand,int year){
        this.brand = brand;
        this.year = year;
    }

    void displayDetail(){
        System.out.println("Brand: " + brand + " | Year: " + year);
    }
}