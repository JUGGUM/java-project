package practice;

class AO{
    public String x(){return "A.x";}
}
class BO extends AO{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class B2 extends AO{
    public String x(){return "B2.x";}
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        //데이터타입은 부모클래스에서만 호출
        AO obj = new BO();
        AO obj2 = new B2();
        System.out.println(obj.x());
        System.out.println(obj2.x());
    }
}
