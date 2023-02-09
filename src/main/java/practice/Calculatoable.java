package practice;

public interface Calculatoable {
    public void setOperands(int firest, int second, int third);
    public int sum();
    public int avg();
    //인터페이스안에 멤버들은 무조건 public이어야한다.
}
