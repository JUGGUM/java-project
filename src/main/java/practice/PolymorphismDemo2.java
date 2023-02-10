package practice;

interface I2 {
    public String A();
}

interface I3 {
    public String B();
}

class D implements I2, I3 {
    public String A() {
        return "A";
    }

    ;

    public String B() {
        return "B";
    }
}

public class PolymorphismDemo2 {
    public static void main(String[] args) {
        D obj = new D();
        I2 obj2 = new D();
        I3 obj3 = new D();

        try {
            System.out.println("ajka");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        obj.A();
        obj.B();

        obj2.A();
//        obj2.B();

//        obj3.A();
        obj3.B();

    }
}
