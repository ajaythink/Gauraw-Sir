class Name {
    String name;
    Name(String name) {
        this.name = name;
    }
}
public class PassByRef {

    public static void change_name(Name a){
        a.name = "Jhon";
        System.out.println(a.name);
    }

    public static void main(String[] args) {
        Name n = new Name("Prince");
        System.out.println(n.name);
        change_name(n);
        System.out.println(n.name);
    }
}
