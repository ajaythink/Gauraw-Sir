class Calculator {
    public void add() {
        System.out.println();
    }

    public int sub(int a) {
        return -a; 
    }
}

class Numbers2 extends Calculator { 
    int a;
    int b;
    Numbers2(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void add() { 
        System.out.println(a+b);
    }

    public double add(double a, double b) {
        return a + b;
    }
    public double sub(double a, double b){
        return Math.abs(a-b);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Numbers2(8,1);
        cal.add();
        System.out.println(((Numbers2)cal).add(9.3,2.1));
    }
}