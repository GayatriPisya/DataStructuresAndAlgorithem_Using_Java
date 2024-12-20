package methods;
//Used to access and update private fields.
public class GetterSetterExample {
    private String name;

    public String getName() { // Getter
        return name;
    }

    public void setName(String name) { // Setter
        this.name = name;
    }

    public static void main(String[] args) {
        GetterSetterExample obj = new GetterSetterExample();
        obj.setName("Gayatri");
        System.out.println("Name: " + obj.getName());
    }
}
