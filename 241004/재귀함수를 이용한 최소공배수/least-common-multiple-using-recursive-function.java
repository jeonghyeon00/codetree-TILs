import java.util.Scanner;

public class Main {

    public static int solution(int[] arr, int n) {
        boolean allIsOkay = true;
        for (int j : arr) {
            if (n % j != 0) {
                allIsOkay = false;
                break;
            }
        }
        if(allIsOkay) {
            return n;
        } else {
            return solution(arr, n + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, 2));
    }
}