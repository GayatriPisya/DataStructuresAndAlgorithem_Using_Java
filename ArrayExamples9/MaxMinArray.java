package ArrayExamples9;

public class MaxMinArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int max = arr[0];
        int min = arr[0];
        for(int i : arr){
            if(i >max){
                max = i;
            }
            if(i < min){
                min =i;
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
    
}
