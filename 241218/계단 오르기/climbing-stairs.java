import java.util.*;

public class Main {
    public static int[] dp = new int[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dp[0] = 1;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        int n = sc.nextInt();
        for(int i = 4; i<= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 3]) % 10007;
        }
        System.out.print(dp[n]);
    }
}