package Sorting11;
import java.util.Arrays;
public class sortingascendingorderex {
    public static void main(String[] args){
        int[] arr = {2,5,4,7,9,10,11,2,0,8};
        String[] letters = {"g", "k", "s","m", "t", "p"};
        System.out.println("Before Sorting array is " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sorting array is " + Arrays.toString(arr));
        System.out.println("Before Sorting letters are " + Arrays.toString(letters));
        Arrays.sort(letters);
        System.out.println("After Sorting letters are " + Arrays.toString(letters));
    }
    
}
