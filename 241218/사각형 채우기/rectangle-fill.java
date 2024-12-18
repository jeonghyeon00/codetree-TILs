import java.util.*;

public class Main {
    public static int[] dp = new int[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dp[0] = 1;
        dp[1] = 1;

        int n = sc.nextInt();
        for(int i = 2; i<= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        System.out.print(dp[n]);
    }
}