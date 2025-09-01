abstract class Animal {
    abstract void sound(); // abstract method (no body)

    void sleep() { // normal method
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();   // Woof Woof!
        dog.sleep();   // Sleeping...

        Animal cat = new Cat();
        cat.sound();   // Meow Meow!
        cat.sleep();   // Sleeping...
    }
}
