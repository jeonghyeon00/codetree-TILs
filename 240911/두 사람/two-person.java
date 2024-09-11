import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        String d = sc.next();
        System.out.println(a >= 19 && b.equals("M") || c >= 19 && d.equals("M") ? 1 : 0);
    }
}