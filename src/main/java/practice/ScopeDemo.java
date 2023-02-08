package practice;

public class ScopeDemo {
    static int i; //전역변수

    static void a() {
        i = 0;
        //전역변수 i 를 사용한다. 안에서 선언하지 않았기때문에
    }
    public static void main(String[] args) {
        for(i = 0; i<5; i++){
            a();
            System.out.println(i);
        }

    }
}
