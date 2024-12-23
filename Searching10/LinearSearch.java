package Searching10;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
        int target = 2;
        // int target = 18;
        // int target = 30;
        int index = LinearSearchex(arr , target);
        if(index != -1){
            System.out.println("Target found at index " + index);
        }else {
            System.out.println("Target not found");
        }
    }
    public static int LinearSearchex(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    
}
