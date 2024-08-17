package ClassAndObject;

public class Bike {
    //creating the class for bikes

        String Model;
        int CC;
        String Color;
        float Price;
        String name;

        Bike(String mod,int speed,String col,float amount,String namm){
                this.Model=mod;
                this.CC=speed;
                this.Color=col;
                this.Price=amount;
                this.name=namm;
        }
        Bike(Bike otherbike){
        //here otherbike belongs yamaha
        //this.model belongs to Newbike
        this.Model=otherbike.Model;
        this.Price=otherbike.Price;
        this.CC=otherbike.CC;
        this.name=otherbike.name;

        }


       void greet(){
               System.out.println("Hello my name is "+ this.name);
       }
       void ChangeName(String Name){
                this.name=Name;
       }

}
