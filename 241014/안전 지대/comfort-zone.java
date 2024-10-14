import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static int[][] grid;
    public static boolean[][] visited;
    public static int n, m;
    public static int maxElement;

    public static boolean canGo(int x, int y, int k) {
        if (x < 0 || x >= n || y < 0 || y >= m) {
            return false;
        }
        if (visited[x][y] || grid[x][y] <= k) {
            return false;
        }
        return true;
    }

    public static void dfs(int x, int y, int k) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(canGo(nx, ny, k)) {
                visited[nx][ny] = true;
                dfs(nx, ny, k);
            }
        }
    }

    public static int getZoneCount(int k) {
        int count = 0;
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (canGo(i, j, k)) {
                    visited[i][j] = true;
                    dfs(i, j, k);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int maxZoneCount = -1;
        int smallestK = -1;
        grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
                maxElement = Math.max(maxElement, grid[i][j]);
            }
        }

        for (int k = 0; k <= maxElement; k++) {
            int zoneNum = getZoneCount(k);
            if(zoneNum > maxZoneCount) {
                maxZoneCount = zoneNum;
                smallestK = k;
            }
        }

        System.out.println(maxZoneCount + " " + smallestK);
    }
}