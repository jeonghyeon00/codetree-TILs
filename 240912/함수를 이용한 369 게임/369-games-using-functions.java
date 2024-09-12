import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        get369Count(a, b);
        System.out.println(get369Count(a, b));
    }

    public static int get369Count(int a, int b) {
        int count = 0;
        for (Integer i = a; i <= b; i++) {
            if(i % 3 == 0) {
                count++;
            } else if (i.toString().contains("3") || i.toString().contains("6") || i.toString().contains("9")) {
                count++;
            }
        }
        return count;
    }
}