import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLength = 0;
        int minLength = 100000;
        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            maxLength = Math.max(maxLength, input.length());
            minLength = Math.min(minLength, input.length());
        }
        System.out.println(maxLength - minLength);
    }
}