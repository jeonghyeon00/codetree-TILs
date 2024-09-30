import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[100];
        int answer = 0;
        while(true) {
            int leftover = a % b;
            arr[leftover] = arr[leftover] + 1;
            a = a / b;
            if(a == 1) {
                break;
            }
        }
        for (int i = 0; i < 100; i++) {
            if(arr[i] != 0) {
                int count = arr[i];
                answer = answer + count * count;
            }
            if(i > b) {
                break;
            }
        }
        System.out.println(answer);
    }
}