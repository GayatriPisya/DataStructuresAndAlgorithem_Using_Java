package LoopsExamples5;

public class ForEachSum {
    public static void main(String[] args){
        int[] nubs = {1,2,3,4,5,6,7,8,9};
        int sum =0;
        for(int i : nubs){
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
