package ClassAndObject;

public class Carsclass {
    String Model;
    int Speed;
    float Price;
    String Colour;

    Carsclass(String model,int Speed,float Price,String Colour){
        this.Model=model;
        this.Speed=Speed;
        this.Price=Price;
        this.Colour=Colour;
    }
    //constructor calling another constructor
    Carsclass(){
        this("dodo",152,214.898f,"green");
    }

}
