package Basic;public class FunctionOverloading {
    public static void main(String[] args) {
        fun("samuel");
        fun(24);
    }
/* here we see the function has same name but the aruguments are different this called as function overloading
* or else the parameter of the datatype must want to be different*/
     static void fun(String name) {
        System.out.println(name);
    }
    static void fun(int age) {
        System.out.println(age);
    }
}
