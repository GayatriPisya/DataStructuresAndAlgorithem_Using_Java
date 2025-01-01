package Searching10;


import java.util.Arrays;
public class BinarySearchwithShorting {
    public static void main(String[] args){
        int arr[] ={3,5,9,8,6,4,7};
        int target = 8;
        // int target = 1;
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int index = binarysearchex(arr, target);
        if(index != -1){
            System.out.println("element found at index "+ index);
        } else {
            System.out.println("element not found");
        }
    }
    public static int binarysearchex(int[] arr, int target){
        int left =0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]< target){
                left = mid+1;
            }else if(arr[mid]> target){
                right = mid -1;
            }
        }
        return -1;
    }
    
}

