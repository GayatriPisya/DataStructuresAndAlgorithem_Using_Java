package InputOutput3;

import java.util.Scanner;
public class InputExample {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your namr: ");
    String name = sc.nextLine();
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    System.out.print("Enter your height: ");
    double height = sc.nextDouble();


    System.out.println("My name is  " + name + ", i am " + age + " my height is " + height);
    sc.close();
    
}
}