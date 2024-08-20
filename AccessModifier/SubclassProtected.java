package AccessModifier;

public class SubclassProtected extends Protectedclass{
    public SubclassProtected(int num, String choice) {
        super(num, choice);

    }

    public static void main(String[] args) {
        SubclassProtected sub=new SubclassProtected(87,"samuel Rajendran");
        System.out.println(sub.choice);
    }
}
