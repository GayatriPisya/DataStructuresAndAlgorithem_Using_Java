package Sorting11;
public class bubleshort {
    public static void main(String[] args){
        int arr[] = {5,4,7,9,2,3,2};
        int size = arr.length;
        int temp =0;
        System.out.println("Before Sorting:");
        for(int nub: arr){
            System.out.print(nub + " ");
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println();
            for(int nub: arr){
                System.out.print(nub + " ");
            }
        }
        System.out.println("\nAfter Sorting:");
        for(int nub: arr){
            System.out.print(nub + " ");
        }
    }
}
