import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(mul * j + " ");
            }
            System.out.println();
            mul++;
        }
    }
}