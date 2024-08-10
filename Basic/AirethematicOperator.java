package Basic;
import java.util.Scanner;

public class AirethematicOperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number num1 : ");
        int  a =sc.nextInt();
        System.out.println("Enter the number num2 : ");
        int  b =sc.nextInt();
        int MOdulo=a%b;
        System.out.println("The Addition value of Modulo is :  " + MOdulo);
    }

}
