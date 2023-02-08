package practice;

public class CalculatorDemo {
    int left, right;
    public CalculatorDemo(int left, int right){
        // 생성자 constructor 이름이 클래스와같아야함
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left + this.right);
    }
    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }
    public static void main(String[] args) {
        CalculatorDemo c1 = new CalculatorDemo(10,20);
        //생성자에게 인자를 준다. 생성자를 만들지않아도 기본으로 생성자 만들어줌
        c1.sum();
        c1.avg();

    }
}
