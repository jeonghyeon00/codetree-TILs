import java.util.*;

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    public static Queue<Node> q;
    public static int[][] grid;
    public static boolean[][] visited;
    public static Scanner sc;
    public static int n, m;

    public static void bfs() {
        int[] dx = new int[]{0, 0, -1, 1};
        int[] dy = new int[]{-1, 1, 0, 0};

        while (!q.isEmpty()) {
            Node node = q.poll();
            int x = node.x;
            int y = node.y;
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if(canGo(newX, newY)) {
                    visited[newX][newY] = true;
                    q.add(new Node(newX, newY));
                }
            }
        }
    }

    public static boolean canGo(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == 1 && !visited[x][y];
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        q = new LinkedList<>();
        grid = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        q.add(new Node(0, 0));
        bfs();

        if(visited[n - 1][m - 1]){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}