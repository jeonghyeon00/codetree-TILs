import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int passCount = 0;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += sc.nextInt();
            }
            if(sum / 4 >= 60) {
                passCount++;
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
        System.out.println(passCount);
    }
}