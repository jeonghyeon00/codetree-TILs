import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static int[][] grid;
    public static boolean[][] visited;
    public static int n, peopleCount;
    public static ArrayList<Integer> townPeopleCount = new ArrayList<>();

    public static void dfs(int x, int y) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                continue;
            }

            if(!visited[ny][nx] && grid[ny][nx] == 1) {
                visited[ny][nx] = true;
                peopleCount++;
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        grid = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                peopleCount = 0;
                if (!visited[i][j] && grid[i][j] == 1) {
                    visited[i][j] = true;
                    peopleCount++;
                    dfs(j, i);
                    townPeopleCount.add(peopleCount);
                }
            }
        }
        System.out.println(townPeopleCount.size());
        Collections.sort(townPeopleCount);
        for (Integer integer : townPeopleCount) {
            System.out.println(integer);
        }
    }
}