// Question:Take an age as input and classify the person?
package ConditionalStatements4;

public class IfElseIfLadderExample {
    public static void main(String[] args){
    int age =20;

    if(age <= 13){
        System.out.println("You are a Child");
    }else if (age > 13 && age <= 19){
        System.out.println("You are a Teenager");
    }else if (age > 19 && age <=59){
        System.out.println("You are an Adult");
    }else{
        System.out.println("You are a Senior Citizen");
    }
}
}