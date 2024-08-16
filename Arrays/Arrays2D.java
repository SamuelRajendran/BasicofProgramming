package Arrays;
import java.util.*;


public class Arrays2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arrs = new int[3][4];
        //input
        for (int row = 0; row < arrs.length; row++) {

            for (int col = 0; col < arrs[row].length; col++) {
              arrs[row][col] = in.nextInt();

            }

        }
        //output
        //  for (int row = 0; row < arrs.length; row++) {
        //   System.out.println(Arrays.toString(arrs[row]));

            //output foreachloop
            for(int[] a:arrs){
                System.out.println(Arrays.toString(a));
            }


    }

}
