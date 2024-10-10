import java.util.Scanner;

public class Main {
    public static int[][] grid;
    public static boolean[] visited;
    // vertex count
    public static int n;
    public static int count = 0;
    public static void DFS(int vertex) {
        for (int currentVertex = 1; currentVertex <= n; currentVertex++) {
            if (grid[vertex][currentVertex] == 1 && !visited[currentVertex]) {
                visited[currentVertex] = true;
                count++;
                DFS(currentVertex);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();

        grid = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int col = sc.nextInt();
            int row = sc.nextInt();
            grid[row][col] = 1;
            grid[col][row] = 1;
        }

        visited[1] = true;
        DFS(1);
        System.out.println(count);
    }
}