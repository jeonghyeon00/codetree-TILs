import java.util.Scanner;

public class Main {
    static int[][] grid;

    public static int getCost(int k) {
        return k * k + (k + 1) * (k + 1);
    }

    public static int getGoldCount(int x, int y, int k) {
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid.length; col++) {
                if(Math.abs(row - x) + Math.abs(col - y) <= k) {
                    if(grid[row][col] == 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = 0;
        grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                for (int k = 0; k <= 2 * (n - 1); k++) {
                    int goldCount = getGoldCount(row, col, k);
                    int cost = getCost(k);
                    if(goldCount * m >= cost) {
                        answer = Math.max(answer, goldCount);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}