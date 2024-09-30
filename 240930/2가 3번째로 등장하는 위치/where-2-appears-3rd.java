import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int twoCount = 0;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] == 2) {
                twoCount++;
            }
            if(twoCount == 3) {
                answer = i + 1;
                break;
            }
        }
        System.out.println(answer);
    }
}