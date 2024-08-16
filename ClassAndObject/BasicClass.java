package ClassAndObject;

import org.w3c.dom.ls.LSOutput;

public class BasicClass {
    public static void main(String[] args) {
        Cars[] cars = new Cars[5];

      Cars Bens=new Cars("Bensprimo",564f,"Green",569);
        System.out.println(Bens.Colour);





    }
}
    class Cars{

        //class is just group of properties and functions
        String name;
        int speed;
        float Price;
        String Colour;

     Cars(String name,float Price,String Colour,int speed){
            this.name=name;
            this.Price=Price;
            this.Colour=Colour;
            this.speed=speed;
        }

    }





