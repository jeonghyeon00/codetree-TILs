import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int sum = a+b+c;
        int avg = sum/3;
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(sum-avg);
    }
}