import java.util.*;

public class Main {
    public static int[] dp = new int[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 7;
        dp[3] = 22;

        int n = sc.nextInt();
        for(int i = 4; i<= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        System.out.print(dp[n]);
    }
}