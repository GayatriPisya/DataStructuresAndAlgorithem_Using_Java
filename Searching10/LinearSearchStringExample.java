package Searching10;

public class LinearSearchStringExample {
    public static void main(String[] args){
        String[] arr = {"Sireesha","Kishore","Geetha","Gayatri","Tulugu","Modi"};
        String target = "Sireesha";
        // String target = "kishore";
        // String target = "Modi";
        int index = linearsearch(arr, target);
        if(index != -1){
            System.out.println("Element found at index " + index);
        }else {
            System.out.println("Element not found");
        }
    }
    public static int linearsearch(String[] arr, String target){
        for(int i =0; i < arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
