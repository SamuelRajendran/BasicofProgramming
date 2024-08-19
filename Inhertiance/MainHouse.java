package Inhertiance;

public class MainHouse {
    public static void main(String[] args) {
     /*   House house1=new House();
        System.out.println(house1.names +" " + house1.value + " " +house1.rooms);
       House house2= new House(3,"Big");
        System.out.println(house2.names +" " + house2.value + " " +house2.rooms);
       House house3= new House(5,"great",5478.65f);
        System.out.println(house3.names +" " + house3.value + " " +house3.rooms);
        House house4=new House(house3);
        System.out.println(house4.names );
        NewClass house5 =new NewClass();
        System.out.println(house5.names + " " +house5.price);*/
        NewClass house6=new NewClass(20,"2bhk",476544.87f,7000000);
        System.out.println(house6.price);
      // here we getting error  System.out.println(house6.rooms);


    }
}
