package Algorithm;

public class TimeComplexityExample1 {
    public static void main(String[] args) {
        // 1~100사이 값 랜덤 선택
        // 빅-오메가 1번 빅-세타 N/2 빅-오 N
        int findNumber = (int)(Math.random() * 100);
        for(int i = 0; i<100; i++){
            if(i == findNumber){
                System.out.println(i);
                break;
            }
        }
    }
}