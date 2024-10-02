import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int number = 1;
        boolean isYIncrease = false;
        boolean isYDecrease = true;
        // when n = 4 and m = 4
        // 33 23 13 03 02 12 22 32 31 21 11 01 00 10 20 30
        // y 3 2 1 0 0 1 2 3 3 2 1 0 0 1 2 3
        // x 3 3 3 3 2 2 2 2 1 1 1 1 0 0 0 0
        for (int x = n - 1; x >= 0; x--) {
            int y = isYDecrease ? n - 1 : 0;
            for (int i = 0; i < n; i++) {
                arr[y][x] = number++;
                if (isYDecrease) {
                    y--;
                } else {
                    y++;
                }
            }
            isYDecrease = !isYDecrease;
            isYIncrease = !isYIncrease;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }


    }
}