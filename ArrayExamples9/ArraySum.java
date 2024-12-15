package ArrayExamples9;

public class ArraySum {
    public static void main(String[] args){
        int[] nubs = {1,2,3,4,5,6,7,8,9};
        int sum =0;
        for(int nub: nubs){
            sum += nub;
            
        }
        System.out.println("Sum is " + sum);
    }
}
