package Arrays;
import java.util.*;

public class AccessingtheArray {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);

        int []arr={11,22,33,44,55,66};
        arr[1]=789;
        //here we using forEachLoop
       /* for(int num:arr)
            System.out.println(num); //or we have another way to print */
        System.out.println(Arrays.toString(arr));

        //input on my own


        int[] arrays=new int[5];
        for(int i=0;i<arrays.length;i++){
            arrays[i]=cs.nextInt(); //see this line we takeing input by value aarays[i]
        }
        System.out.println(Arrays.toString(arrays));
    }
}
