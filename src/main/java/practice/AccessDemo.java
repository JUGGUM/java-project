package practice;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}
public class AccessDemo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x());
        System.out.println(a.y());
        // 밑은 오류를 발생시킨다. private
//        System.out.println(a.z());
    }
}
