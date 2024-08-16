package Arrays;
import java.util.*;

public class ArrayNotFixedSize {
    public static void main(String[] args) {
        int[][] arr= {
                {1, 2, 3, 4},
                {7, 8},
                {78, 97, 63, 25}
        };
        //input
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){

            }
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
