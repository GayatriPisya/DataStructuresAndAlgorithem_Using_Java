package methods;

public class UserDefinedExample {
    public static void greet(){
        System.out.println("Hello ! happy coding");
    }
    public static void add(int a, int b){
        int result = a + b;
        System.out.println("Sum is : " + result);
    }
    public static void main(String[] args){
        greet();
        add(5,8);
    }
}
