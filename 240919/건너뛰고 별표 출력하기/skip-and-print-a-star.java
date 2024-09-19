import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int starCount = 1;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
            if(i >= n) {
                starCount--;
            } else {
                starCount++;
            }
        }
    }
}