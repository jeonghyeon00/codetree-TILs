import java.util.Scanner;

public class Main {
    static int[][] matrix;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 연속해야하는 숫자의 개수
        int m = sc.nextInt();
        int count = 0;

        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int lastNumber;
        int sameNumberCount = 1;
        // 가로 탐색
        for (int row = 0; row < n; row++) {
            lastNumber = -1;
            for (int col = 0; col < n; col++) {
                if(lastNumber == matrix[row][col]) {
                    sameNumberCount++;
                    if(sameNumberCount >= m) {
                        sameNumberCount = 1;
                        count++;
                        break;
                    }
                } else {
                    lastNumber = matrix[row][col];
                    sameNumberCount = 1;
                }
            }
            if(sameNumberCount >= m) {
                count++;
            }
        }

        // 세로 탐색
        for (int col = 0; col < n; col++) {
            lastNumber = -1;
            for (int row = 0; row < n; row++) {
                if(lastNumber == matrix[row][col]) {
                    sameNumberCount++;
                    if(sameNumberCount >= m) {
                        sameNumberCount = 1;
                        count++;
                        break;
                    }
                } else {
                    lastNumber = matrix[row][col];
                    sameNumberCount = 1;
                }
            }
        }

        System.out.println(count);
    }
}