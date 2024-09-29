import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j < n + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}