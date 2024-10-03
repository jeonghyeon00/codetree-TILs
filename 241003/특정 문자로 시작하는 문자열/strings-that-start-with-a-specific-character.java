import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        String alphabet = sc.next();
        for (int i = 0; i < n; i++) {
            if(arr[i].charAt(0) == alphabet.charAt(0)){
                sum += arr[i].length();
                count++;
            }
        }
        System.out.printf("%d %.2f", count, (double)sum/count);
    }
}