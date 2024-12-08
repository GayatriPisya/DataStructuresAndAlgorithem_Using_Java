package ConditionalStatements4;

public class SwitchWithStringExample {
    public static void main(String[] args){
        String name = "Gayatri";

        switch(name){
            case "Geetha":
            System.out.println("Name is Geetha");
            break;
            case "Gayatri":
            System.out.println("Name is Gayatri");
            break;
            case "Sireesha":
            System.out.println("Name is Sireesha");
            break;
            case "Kishore Babu":
            System.out.println("Name is Kishore Babu");
            break;
            default:
            System.out.println("Name is not found");
        }
    }
}
