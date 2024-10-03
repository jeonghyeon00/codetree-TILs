import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        for (int i = 0; i < string.length(); i++) {
            if(i % 2 != 0) {
                System.out.print(string.charAt(i));
            }
        }
    }
}