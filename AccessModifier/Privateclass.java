package AccessModifier;
public class Privateclass {
    //only i can use this on this class only.
    //another way to use this means use methodes
   private int a;
   private String b;



    public Privateclass(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public int setA(int a) {
        this.a = a;
        return a;
    }

    public void setB(String b) {
        this.b = b;
    }
}
