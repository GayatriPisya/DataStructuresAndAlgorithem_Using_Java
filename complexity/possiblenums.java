public class possiblenums{
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5,6,7,8,};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(" " + arr[i] + "  " + arr[j]);
            }
        }

    }
}

// The time complexity of this code is O(n^2) where n is the length of the array.
// This is because there are two nested loops, each iterating through the array of length n