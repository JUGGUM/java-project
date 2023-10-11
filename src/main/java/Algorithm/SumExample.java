package Algorithm;

import java.util.Scanner;

/**
 * N개의 숫자가 공백없이 써있다. 이 숫자를 모두 합해 출력하는 프로그램
 * 1번째 줄의 숫자의 개수 N(1<= N <= 100) 2번째 줄의 숫자 N개가 공백없이 주어진다.
 */
public class SumExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (char c : cNum) {
            sum += c - '0';
        }
        System.out.println(sum);
    }

}

