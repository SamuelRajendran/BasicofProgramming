package Basic;
import java.util.*;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Functionbasic {
    public static void main(String[] args) {
       // show();
       // int store=numreturn(25,65);
       // System.out.println(store);
      //  String ans=name("samuel");
      //  System.out.println(ans);
      //  boolean see=oddoreven(57);
      //  System.out.println(see);
        int []arrs={101,24,39,44,57,69,75,80,93};
        oddeven(arrs);

    }
   /* static void show(){
        System.out.println("Iam showing nothing");
    }
    static int numreturn(int a,int b){
       int  num=a+b;
        return num;
    }
    static String name(String namm){

        return ("Mera namm is " + namm);
    }
    static boolean oddoreven(int num){
        if(num %2!=0){
            return true;
    }else{
            return false;
        }

}*/

   static void oddeven(int []arrs){

       List<Integer> oddnuber=new ArrayList<>();
       List<Integer> evennumber=new ArrayList<>();
       for(int num : arrs){
           if(num%2!=0){
               oddnuber.add(num);
           }

           else{
               evennumber.add(num);
           }


       }
       System.out.println(oddnuber);
       System.out.println(evennumber);

}
}