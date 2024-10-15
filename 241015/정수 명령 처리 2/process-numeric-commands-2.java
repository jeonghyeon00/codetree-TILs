import java.util.*;

public class Main {
    public static Queue<Integer> q;
    public static Scanner sc;

    public static void doCommand(){
        String command = sc.next();
        if(command.equals("push")) {
            int num = sc.nextInt();
            q.add(num);
        } else if(command.equals("front")) {
            System.out.println(q.peek());
        } else if(command.equals("pop")) {
            System.out.println(q.poll());
        } else if(command.equals("size")) {
            System.out.println(q.size());
        } else if(command.equals("empty")) {
            System.out.println(q.isEmpty() ? 1 : 0);
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            doCommand();
        }
    }
}