package ConditionalStatements4;

public class TernaryExample {
    public static void main(String[] args){
        int nub = 8;
        String result = (nub %2 ==0) ? "Even" : "Odd";
        System.out.println("The number " + nub + " is " + result);
    }
}
