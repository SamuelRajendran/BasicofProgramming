package Basic_of_Function;

public class ScopingFunction {
    public static void main(String[] args) {
        //here we Intialazing outside
        int a=10;
        int b=20;
        //you can access here
      //  System.out.println(a);
        showme(a);
        System.out.println(a);

        //here I'm created a block
        {
           // I can use  variable that Intialze  outside of the block
            a=100;
            //here original value is updated
            int c=200;
            System.out.println(c);        //here i can use the variable c but i cant use it in outside
        }
        System.out.println(a);
      //  System.out.println(c); here i'm trying to access the block of the variable but  i cant access it.

    }
    static void showme(int A){
        A=1000;  //only i can use this on this block only
        System.out.println(A);

    }
}
