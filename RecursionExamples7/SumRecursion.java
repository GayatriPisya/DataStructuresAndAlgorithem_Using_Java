package RecursionExamples7;

public class SumRecursion {
    public static void main(String[] args){
        int n = 6;
        System.out.println("Sum of "+ n + " natural numbers is " + sum(n));
    }
    public static int sum(int n){
        if(n ==0) {
            return 0;
        }
        return n + sum(n - 1);
    }
    
}
