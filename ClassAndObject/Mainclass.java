package ClassAndObject;

public class Mainclass {
    public static void main(String[] args) {
        Carsclass Audi=new Carsclass("ZX",436,2000000.98457f,"Black");
        System.out.println(Audi.Speed);
        System.out.println(Audi.Colour);
        System.out.println(Audi.Model);
        System.out.println(Audi.Price);
        Carsclass random=new Carsclass();
        //here we calling the another constructor by just using (this) and assigning the value.
        System.out.println(random.Model);
    }
}
