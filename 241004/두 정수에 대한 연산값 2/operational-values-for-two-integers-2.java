import java.util.Scanner;

public class Main {

    public static int maxMultiply(int a, int b) {
        return Math.max(a, b) * 2;
    }

    public static int minAdd(int a, int b) {
        return Math.min(a, b) + 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            a = maxMultiply(a, b);
            b = minAdd(a, b);
        } else {
            b = maxMultiply(a, b);
            a = minAdd(a, b);
        }

        System.out.printf("%d %d", a, b);
    }
}