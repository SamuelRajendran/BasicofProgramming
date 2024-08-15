package Basic_of_Function;
import java.util.Scanner;

public class FunctionAruguments {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the Name :");
        String name=in.nextLine();
        String greet=Mygreet(name);
        System.out.println(greet);
    }

    private static String Mygreet(String namm) {
        String message="Hello "+namm;
        return message;
    }

}
