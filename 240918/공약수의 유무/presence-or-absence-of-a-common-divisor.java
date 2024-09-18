import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;
        for (int i = a; i <= b; i++) {
            if(2880 % i == 0 && 1920 % i == 0) {
                answer = 1;
                break;
            }
        }
        System.out.println(answer);
    }
}