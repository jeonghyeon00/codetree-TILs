import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        while (true) {
            if (n % 2 == 0) {
                n = n * 3 + 1;
            } else {
                n = n * 2 + 2;
            }
            count++;
            if (n >= 1000) break;
        }

        System.out.println(count);

    }
}