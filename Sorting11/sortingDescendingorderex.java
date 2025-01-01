package Sorting11;
import java.util.Arrays;
import java.util.Collections;
public class sortingDescendingorderex {
    public static void main(String[] args){
        Integer[] arr = {10, 100, 20, 90, 30, 40, 80};
        String[] letters ={"a", "f", "g", "d", "e","b", "c"};
        System.out.println("Before sorting array: " + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("After sorting array in descending order: " + Arrays.toString(arr));
        System.out.println("Before sorting letters: " + Arrays.toString(letters));
        Arrays.sort(letters , Collections.reverseOrder());
        System.out.println("After sorting letters in descending order: " + Arrays.toString(letters));
    }
}
