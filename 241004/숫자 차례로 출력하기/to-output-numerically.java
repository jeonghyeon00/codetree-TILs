import java.util.Scanner;

public class Main {
    public static void solution1(int now, int until) {
        if(now > until) {
            System.out.println();
            return;
        }
        System.out.print(now + " ");
        solution1(now + 1, until);
    }

    public static void solution2(int n) {
        if(n == 0) {
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        solution2(n - 1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution1(1, n);
        solution2(n);
    }
}