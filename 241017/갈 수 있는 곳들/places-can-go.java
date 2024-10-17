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
    public static int n;
    public static int count;

    public static void bfs() {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        while (!q.isEmpty()) {
            Node node = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if(grid[nx][ny] == 1) {
                    continue;
                }
                visited[nx][ny] = true;
                q.add(new Node(nx, ny));
                count++;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        q = new LinkedList<>();
        grid = new int[n][n];
        visited = new boolean[n][n];
        count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            q.add(new Node(x - 1, y - 1));
            visited[x - 1][y - 1] = true;
            count++;
        }
        bfs();

        System.out.println(count);
    }
}