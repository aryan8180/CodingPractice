public class Problem10 {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Corolla", 2020);
        c1.displayDetails();

        c1.refuel(30);
        c1.drive(100);
        c1.displayDetails();

        c1.drive(100);
        c1.displayDetails();

        c1.drive(100);
        c1.displayDetails();

        c1.drive(100);
        c1.displayDetails();
    }
}

class Car{
    private String brand;
    private String model;
    private int year;
    private double fuellevel;

    Car(){
        brand = "Unknown";
        model = "Unknown";
        year = 0;
        fuellevel = 0;
    }

    Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuellevel = 0;
    }

    public void refuel(double liters){
        if(liters>0 && fuellevel+liters<=50){
            fuellevel += liters;
        }else{
            System.out.println("Cannot fill the fuel!");
        }
    }

    public void drive(double distance){
        double fuel_consumed = distance/10;
        if(fuel_consumed>fuellevel){
            System.out.println("Not enough fuel!Don't drive");
        }else{
            this.fuellevel -= fuel_consumed;
        }

    }

    public double getFuelLevel(){
        return fuellevel;
    }

    void displayDetails(){
        System.out.println("Brand: " + brand + " | Model: " + model + " | Build year: " + year + " | Fuel Level: " + fuellevel + ".");
    }


}


