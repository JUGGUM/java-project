package practice;

public class MethodDemo {

    public static int numbering(int limit) {
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(args.length);
        // 재활용, 코드량 줄일수있고 유지보수유리
        numbering(5);
        numbering(4);
        numbering(3);
    }
}
