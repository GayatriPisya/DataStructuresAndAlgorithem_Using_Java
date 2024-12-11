package LoopsExamples5;

public class WhileloopReverseNumber {
    public static void main(String[] args){
        int nub = 89;
        int reverse =0;
        while(nub !=0){
            int digit = nub % 10;
            reverse = reverse * 10 +digit;
            nub /= 10;
        }
        System.out.println("Reversed number: " + reverse);
    }
}
