package practice;
class DivideException extends RuntimeException{
    DivideException() {
        super();
    }
    //생성자로 주고
    DivideException(String message){
        super(message);
    }
    // 부모클래스의 생성자를 호출할때 메세지
}
class Calculator {
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if(right == 0){
            throw new DivideException("알라알라");
        }
        System.out.println(this.left/this.right);
    }
}
public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator c2 = new Calculator();
        c2.setOprands(10,0);
        try{
            c2.divide();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
