package Algorithm;

public class Example {
    public static void main(String[] args) {
        String sNum = "1234";
        int i1 = Integer.parseInt(sNum); // Int 타입으로 반환
        int i2 = Integer.valueOf(sNum); // Integer으로 객체 반환
        System.out.println(i1);
        System.out.println(i2);
    }
}
