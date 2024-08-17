package ClassAndObject;

import java.util.WeakHashMap;

public class MainConstructorCalling {
    public static void main(String[] args) {
        Bike Yamaha=new Bike("R15",150,"Sky Blue",200000.25f,"sam");
        System.out.println(Yamaha.Model);
        System.out.println(Yamaha.CC);
        System.out.println(Yamaha.Price);
        System.out.println(Yamaha.Color);
        Bike Bajaj=new Bike("Zigzer",200,"black",300000.89f,"Rahul");

       Yamaha.greet();
        Bajaj.greet();
        Bajaj.ChangeName("Samuel Rajendran");
        Bajaj.greet();


        //constructor calling another methode
        Bike Newbike=new Bike(Yamaha);
        System.out.println(Newbike.name);
    }
}
