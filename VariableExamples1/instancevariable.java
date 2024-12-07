package VariableExamples1;
//Instance Variables: Declared inside a class, but outside any method.
public class instancevariable{
        int age; // Instance variable 'age' declared inside the class
        public  instancevariable(int age) {
            this.age = age;
        }
        public void display(){  // Method to display the value of 'age'
            System.out.println("Age: " + age);
        }
        public static void main(String[] args){
            instancevariable variable =new instancevariable(20);
            variable.display();
        }
}
