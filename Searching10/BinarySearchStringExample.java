package Searching10;

public class BinarySearchStringExample {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        int index = binarysearch(arr, target);
        if(index != -1){
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
    public static int binarysearch(int[] arr, int target){
        int low =0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid] < target){
                low = mid +1;            
            }else if(arr[mid] > target){
                low = mid -1;
            }
        }
        return -1;
    }
}