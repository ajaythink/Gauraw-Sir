// package Gauraw Sir;
class Felis{
    public void sound(){
        System.out.println("cat meow");
    }
}
class lion extends Felis{
    @Override
    public void sound(){
        System.out.println("Lion Rawrr");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Felis cat = new Felis();
        Felis Lion = new lion();
        cat.sound();
        Lion.sound();
    }
}
