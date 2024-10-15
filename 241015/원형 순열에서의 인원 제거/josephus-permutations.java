import java.util.*;

public class Main {
    public static Queue<Integer> q;
    public static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while(!q.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                q.add(q.poll());
            }
            System.out.print(q.poll() + " ");
        }
    }
}