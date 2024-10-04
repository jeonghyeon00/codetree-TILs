import java.util.Scanner;

public class Main {
    public static void solution1(int n) {
        if(n == 0) {
            return;
        }
        solution1(n - 1);
        System.out.print(n + " ");
    }

    public static void solution2(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        solution2(n - 1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution1(n);
        System.out.println();
        solution2(n);
    }
}