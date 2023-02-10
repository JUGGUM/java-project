package practice;
class Calculator{
    int left; int right;
    public void setOpreands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void divide(){
        if(right == 0){
            throw new ArithmeticException("두번째 인자는 0을 허용하지않습니다.");
        }
        try{
            System.out.println("계산결과는");
            System.out.println(this.left/this.right);
            System.out.println("입니다.");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator c2 = new Calculator();
        c2.setOpreands(10,0);
        c2.divide();
    }
}
