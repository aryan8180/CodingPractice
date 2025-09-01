// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle("Circle",5);
        c1.area();
        Rectangle r1 = new Rectangle("Rectangle", 5,6);
        r1.area();
        Triangle t1 = new Triangle("Triangle",6,12);
        t1.area();

    }
}

class Shape{
    private String name;

    Shape(String name){
        this.name = name;
    }

    void area(){
        System.out.println("Area is not defined " + name);
    }
}

class Circle extends Shape{
    double radius;

    Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    void area(){
        System.out.println("Area of Circle: " + 3.14*radius*radius);
    }
}

class Rectangle extends Shape{
    double length,width;

    Rectangle(String name, double length, double width){
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    void area(){
        System.out.println("Area of Rectangle: " + length*width);
    }
}

class Triangle extends Shape{
    double base,height;

    Triangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    void area(){
        System.out.println("Area of Triangle: " + (0.5)*base*height);
    }
}