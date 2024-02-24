//Overloding concept here
// In single class there are more then one method but same name with different parameter
public class Calculator {
    int Add(int a, int b){
        return a + b;
    }
    int Add(int a, int b, int c){
        return a + b + c;
    }
    double Add(double a, double b){
        return a + b;
    }
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.Add(19, 21));
        System.out.println(c.Add(10, 20, 30));
        System.out.println(c.Add(10.5, 10.4));

    }
}
