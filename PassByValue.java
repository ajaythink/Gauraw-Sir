public class PassByValue{
    public void change_value(int a){
        a = 20;
        System.out.println(a);
    }
    public static void main(String[] args) {
        PassByValue obj = new PassByValue();
        int a = 10;
        obj.change_value(a);
        System.out.println(a);
    }
}