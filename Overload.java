// package Gauraw Sir;
class overloading{
    public int area(int a){
        int area = a * a;
        return area;
    }
    public double area(double length, double breath){
        double area = length * breath;
        return area;
    }
    public String area(float radius){
        double area = 3.14 * radius * radius;
        return Double.toString(area);
    }
}
public class Overload {
    public static void main(String[] args) {
        overloading obj = new overloading();
        int square = 5;
        int len = 8;
        int bre = 9;
        float  radius = 7.63f;        
        System.out.println(obj.area(square));
        System.out.println(obj.area(len, bre));
        System.out.println(obj.area(radius));
 
    }
}
