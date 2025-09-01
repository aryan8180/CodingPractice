public class Practice {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Leo";
        d1.age = 2;
        d1.breed = "Pug";

        Cat c1 = new Cat();
        c1.name = "Aska";
        c1.age = 1;
        c1.color = "Black";

        // Dog
        d1.displayInfo();
        d1.bark();

        // Cat
        c1.displayInfo();
        c1.meow();
    }
}

class Animal {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}

class Dog extends Animal {
    String breed;

    @Override
    void displayInfo() {
        super.displayInfo(); // calls Animal's displayInfo
        System.out.println("Breed: " + breed);
    }

    void bark() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    String color;

    @Override
    void displayInfo() {
        super.displayInfo(); // calls Animal's displayInfo
        System.out.println("Color: " + color);
    }

    void meow() {
        System.out.println("Meow! Meow!");
    }
}
