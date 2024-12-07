package DataTypeExamples2;

public class ReferenceDataTypes {
    public static void main(String[] args){
        String name = "Pisya Gayatri"; // String is a reference data type
        System.out.println("My Name is " + name);

        int[] numbers ={1,2,3,4,5,6}; //Array
        System.out.println("Array First Number is : " + numbers[0]);

        Myobject myobject = new Myobject("Gayatri" ,20);
        System.out.println("My Name is " + myobject.name + ", I am " + myobject.age + " years old");
    }
    
}
class Myobject{
    String name;
    int age;
    public Myobject(String name, int age) {
        this.name=name;
        this.age=age;
    }
}