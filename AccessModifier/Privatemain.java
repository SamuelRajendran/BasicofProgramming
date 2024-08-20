package AccessModifier;

public class Privatemain {
    public static void main(String[] args) {
        Privateclass p=new Privateclass(10,"Samuel");
       // i'm getting error System.out.println(p.a);
        System.out.println(p.getA());
        p.setA(45);
        System.out.println(p.setA(78));
    }
}
