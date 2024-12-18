import java.util.Scanner;

public class Main {
    public static int[] memo = new int[46];
    public static int fib(int n) {
        if(memo[n] != -1) return memo[n];
        if(n == 1 || n == 2) {
            return memo[n] = 1;
        }
        return memo[n] = fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        for(int i  = 0; i <= 45; i++)
            memo[i] = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println(fib(sc.nextInt()));
    }
}