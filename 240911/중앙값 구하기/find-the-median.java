import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a < b) {
            if (b < c) {
                System.out.println(b);
            }
            // c < b > a
            else if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        }
        // b < a
        else {
            if (a < c) {
                System.out.println(a);
            } else if (b > c) {
                System.out.println(b);
            }
            // b < c
            else {
                System.out.println(c);
            }
        }
    }
}