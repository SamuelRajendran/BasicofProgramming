package Basic_of_Function;

import java.util.Arrays;

public class VariableLengthArugument {
    public static void main(String[] args) {
        Variable(12,56,89,47,63);

       variable(10,20,"Sam","Rasitha");
    }
    static void Variable(int ...V){
        //here we dont know the how many input we are going to give
        //Internially this will take array of int,String,Char
        //Without Arrays.toString() method this wont display output
        //This we call as variable length aruguments

        System.out.println(Arrays.toString(V));


    }
    static void variable(int a,float b,String ...d){
        //here we takeing multiple variable
        //rule is We only use variable arugumrnts in the last only.
        //Also we need to give the value in the keyword arugument.(order we decalred)

    }
}
