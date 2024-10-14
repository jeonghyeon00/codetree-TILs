import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static int[][] grid;
    public static boolean[][] visited;
    public static int n;
    public static int blockCount;

    public static void dfs(int x, int y, int k) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                continue;
            }

            if (visited[nx][ny] || grid[nx][ny] == 0 || grid[nx][ny] != k) {
                continue;
            }

            visited[nx][ny] = true;
            blockCount++;
            dfs(nx, ny, k);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int maxBlockSize = 0;
        int blockExplodeCount = 0;
        grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int k = 1; k <= 100; k++) {
            visited = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    blockCount = 0;
                    if (grid[i][j] == k) {
                        visited[i][j] = true;
                        blockCount = 1;
                        dfs(i, j, k);
                        maxBlockSize = Math.max(blockCount, maxBlockSize);
                        if (blockCount >= 4) {
                            blockExplodeCount++;
                        }
                    }
                }
            }
        }
        System.out.println(blockExplodeCount + " " + maxBlockSize);
    }
}