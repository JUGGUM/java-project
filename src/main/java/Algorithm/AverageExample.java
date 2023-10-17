package Algorithm;

import java.util.Scanner;

public class AverageExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0; i< n; i++){
            A[i] = sc.nextInt();
        }

        long max = 0;
        long sum = 0;
        for(int i  = 0; i<n; i++){
            if(A[i] > max){
                max = A[i];
            }
            sum += A[i];
        }
        System.out.println(sum*100/max/n);
        // 점수 / 최댓값 * 100
    }
}
