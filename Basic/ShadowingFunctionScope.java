package Basic;

public class ShadowingFunctionScope {
    //But see here we can access the variable through all  in this function
    //Main thing is we have to intialize with static.
     static int sam=10;

    public static void main(String[] args) {
        //here we intialiazing the variable
        //only you can access this variable in the main function scope

        System.out.println(sam); //10
        int sam=200; //here the shadowing is happen
        //here we declaring the variable
        int x;
        //here we intialazing the variable
        x=20;

        System.out.println(sam); //200
        just();
    }
    static void just(){
        System.out.println(sam); //here this is another block so shadowing will not work here
        //10
    }


}
