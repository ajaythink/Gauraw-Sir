// package JAVA-14-SURE-main.Gauraw Sir.Inheritance;
class Parent{
    String message = "Good morning I am Parent Class.";
    public void printMessage(){
        System.out.println(message);
    }

}
class Child extends Parent{
    String message = "Good Morning I am child class.";
    public void printMessage(){
        System.out.println(super.message);
        System.out.println(message);
        super.printMessage();
    }
}
class Baby extends Child {
    String message = "Good morning I am baby class.";
    public void printMessage(){
        System.out.println(super.message);
        super.printMessage();
    }
}
public class FinalKeyWord {
    public static void main(String[] args) {
        Child child = new Child();
        // child.printMessage();
        Baby baby = new Baby();
        baby.printMessage();
    }
}
