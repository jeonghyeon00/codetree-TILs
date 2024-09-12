import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while(true) {
            n /= i;
            if(n <= 1) {
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}