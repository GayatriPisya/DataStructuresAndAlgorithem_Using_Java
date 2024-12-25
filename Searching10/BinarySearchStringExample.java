package Searching10;

public class BinarySearchStringExample {
    public static void main(String[] args){
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String target = "g";
        int index = Binarysearch(arr, target);
        if(index != -1){
            System.out.println("Element found at index " + index);
        }else {
            System.out.println("Element not found");
        }
    }
    public static int Binarysearch(String[] arr, String target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid].equals(target)){
                return mid;
            }else if(arr[mid].compareTo(target) < 0){
                low = mid + 1;
            }else if(arr[mid].compareTo(target) > 0){
                high = mid - 1;
            }
        }
        return -1;
    }
    
}
