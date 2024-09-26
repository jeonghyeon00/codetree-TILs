import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < 4; i++) {
            for (int k = b; k >= 0; k--) {
                System.out.printf("%d * %d = %d", k, (i + 1) * 2, k * (i + 1) * 2);
                if(k == a) {
                    break;
                }
                else {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}