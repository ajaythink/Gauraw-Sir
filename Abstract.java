abstract class Shape{
    abstract double area();
}
 class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double area(){
        return radius * radius * Math.PI;
    }

 }

class square extends Shape{
    double side;
    square(double side){
        this.side = side;
    }
    double area(){
        return side * side;
    }
 }
public class Abstract {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        square s = new square(5);
        System.out.println(c.area());
        System.out.println(s.area());

    }
}
