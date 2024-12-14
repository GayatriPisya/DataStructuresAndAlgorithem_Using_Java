package RecursionExamples7;

public class FibonacciRecursion {
    public static void main(String[] args){
        int nub = 8;
        System.out.println("FibonacciRecursion");
        for(int i =0; i < nub; i ++){
            System.out.print(fibonacci(i) + "  ");
        }
         
    }
    public static int fibonacci(int nub){
        if(nub == 0) return 0;
        if(nub == 1) return 1;
    
    return fibonacci(nub-1) + fibonacci(nub-2);
    }
}
