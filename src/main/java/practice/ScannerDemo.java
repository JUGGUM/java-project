package practice;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt()*1000);
        }
        scanner.close();
    }
}
