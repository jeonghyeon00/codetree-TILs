import java.util.Scanner;

public class Main {
    static int[][] matrix;

    public static int getCoins(int startRow, int startCol) {
        int coinCount = 0;
        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                if(matrix[row][col] == 1) {
                    coinCount++;
                }
            }
        }
        return coinCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(row + 2 >= n || col + 2 >= n) {
                    continue;
                }
                count = Math.max(count, getCoins(row, col));
            }
        }
        System.out.println(count);
    }
}