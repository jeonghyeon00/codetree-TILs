import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        for (int i = string.length(); i >= 0; i--) {
            if(i % 2 != 0) {
                System.out.print(string.charAt(i));
            }
        }
    }
}