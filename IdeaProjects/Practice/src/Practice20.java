// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.display();
        System.out.println("Circle Area: " + c1.area());
        System.out.println("Circle Perimeter: " + c1.perimeter());

        Rectangle r1 = new Rectangle(5,10);
        r1.display();
        System.out.println("Rectangle Area: " + r1.area());
        System.out.println("Rectangle Perimeter: " + r1.perimeter());
    }
}

abstract class Shape{
    abstract double area();
    abstract double perimeter();

    void display(){
        System.out.println("This is a shape");
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI*radius*radius;
    }

    @Override
    double perimeter(){
        return 2*Math.PI*radius;
    }
}

class Rectangle extends Shape{
    double length,width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length*width;
    }

    @Override
    double perimeter(){
        return 2*(length+width);
    }
}