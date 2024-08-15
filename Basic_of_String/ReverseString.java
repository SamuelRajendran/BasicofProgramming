package Basic_of_String;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Name : ");
        String Name=sc.nextLine();
   // String Name="samuel"; //input
        //int Length=Name.length();
        String Rev=" ";
        for(int i=Name.length()-1;i>=0;i--){
          char ch=Name.charAt(i);
          Rev +=ch;
        }
        System.out.println(Rev);

    }
}
