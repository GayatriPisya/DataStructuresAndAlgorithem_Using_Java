// Positive and Even/Odd Number
package ConditionalStatements4;
public class NestedIfExample {
    public static void main(String[] args){
        int number = 10;
        // int number = 15;
        // int number = -18;
        if(number >= 0){
            if(number %2 == 0){
                System.out.println(number + " is positive and even");
            }else{
                System.out.println(number + " is positive and odd");
            }
        }else{
            System.out.println(number + " is negative");
        }
    }
}
