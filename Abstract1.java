abstract class Shape{
    abstract void area();
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void area(){
        System.out.println(radius * radius * Math.PI);
    }
}
class Square extends Shape{
    double side;
    Square(double side){
        this.side = side;
    }
    void area(){
        System.out.println(side * side);
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        c.area();

        Square s = new Square(20);
        s.area();
    }
    
}
