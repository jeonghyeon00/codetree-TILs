import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = 999;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                answer = Math.min(answer, Math.abs(arr[i] - arr[j]));
            }
        }
        System.out.println(answer);
    }
}