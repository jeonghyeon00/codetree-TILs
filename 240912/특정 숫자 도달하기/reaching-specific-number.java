import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int input = sc.nextInt();
            if(input >= 250) {
                break;
            }
            sum += input;
            count++;
        }
        System.out.printf("%d %.1f", sum, (double) sum / count);
    }
}