import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            sb.append(sc.nextLine());
        }
        System.out.println(sb.toString().replace(" ", ""));
    }
}