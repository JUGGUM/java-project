package practice;
abstract class AB{
    public abstract int b();

    // abstract 는 본로직을 가지고있으면 안된다.
//    public abstract int c(){
//        System.out.println("HELLO");}
    public void d(){
        System.out.println("world");
    }
}
class B extends AB{
    public int b(){
        return 1;
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();
    }
}
