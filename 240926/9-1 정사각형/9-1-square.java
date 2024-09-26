import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int outputNumber = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(outputNumber == 0) {
                    outputNumber = 9;
                }
                System.out.print(outputNumber--);
            }
            System.out.println();
        }
    }
}