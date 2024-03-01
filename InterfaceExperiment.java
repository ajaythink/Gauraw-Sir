abstract class A{
    abstract public void A();
}
abstract class B{
    abstract public void B();
}
class C implements A, B{
    public void A(){
        System.out.println("Welcome");
    }
    public void B(){
        System.out.println("thank you.");
    }
}

public class InterfaceExperiment {
    
}
