import java.util.Scanner;

public class Main {
    public static int[][] grid;
    public static boolean[][] visited;
    public static int n, m;

    public static boolean dfs(int x, int y) {
        int[] dx = {1, 0};
        int[] dy = {0, 1};
        if(x == n - 1 && y == m - 1) {
            return true;
        }
        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && grid[nx][ny] == 1) {
                visited[nx][ny] = true;
                if(dfs(nx, ny)) {
                    return true;
                }
            }
        }



        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        grid = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        if(dfs(0,0)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}