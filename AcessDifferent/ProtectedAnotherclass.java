package AcessDifferent;
import AccessModifier.Protectedclass;

public class ProtectedAnotherclass extends Protectedclass {

    public ProtectedAnotherclass(int num, String choice) {
        super(num, choice);
    }

    public static void main(String[] args) {
        ProtectedAnotherclass pro=new ProtectedAnotherclass(69,"anyone");
        System.out.println(pro.choice);
    }
}
