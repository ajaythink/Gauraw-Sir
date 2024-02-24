// Shape class (base class)
abstract class Shape {
    // Abstract method to calculate the area
    abstract double calculateArea();
}

// Circle class (subclass)
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the calculateArea() method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class (subclass)
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the calculateArea() method
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Triangle class (subclass)
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor for Triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override the calculateArea() method
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class FirstQuestion1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(3.0, 8.0);
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
