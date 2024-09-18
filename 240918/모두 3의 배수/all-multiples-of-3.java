import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean answer = true;
        for (int i = 0; i < 5; i++) {
            if(!(sc.nextInt() % 3 == 0)) {
                answer = false;
            }
        }
        
        if(answer) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}