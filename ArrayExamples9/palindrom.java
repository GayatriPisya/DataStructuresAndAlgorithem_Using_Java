import java.util.Scanner;
public class palindrom {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        if(ispalendrom(str)){
            System.out.println(str + " is a palendrom");
        }else{
            System.out.println(str + " is not a palendrom");
        }
        sc.close();
    }
    public static boolean ispalendrom(String str){
        int start =0;
        int end = str.length()-1;
        while(start< end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }else{
                start ++;
                end--;
            }
        }
        return true;

    }
}