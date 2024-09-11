import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solution(n, m));
    }

    public static int solution(int n, int m) {
        for (int i = 1; i < n * m; i++) {
            if (i % n == 0 && i % m == 0) {
                return i;
            }
        }
        return n * m;
    }
}