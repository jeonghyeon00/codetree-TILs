import java.util.Scanner;

public class Main {
    static int[][] grid;
    public static int getFirstBlockSum(int startRow, int startCol) {
        int niun = getNiunSum(startRow, startCol);
        int giuk = getGiukSum(startRow, startCol);
        int niunFlipped = getNiunFlippedSum(startRow, startCol);
        int giukFlipped = getGiukFlippedSum(startRow, startCol);
        return Math.max(Math.max(niun, giuk), Math.max(niunFlipped, giukFlipped));
    }

    public static int getNiunFlippedSum(int startRow, int startCol) {
        try {
            return grid[startRow][startCol + 1] + grid[startRow + 1][startCol] + grid[startRow + 1][startCol + 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public static int getGiukFlippedSum(int startRow, int startCol) {
        try {
            return grid[startRow][startCol] + grid[startRow][startCol + 1] + grid[startRow + 1][startCol];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public static int getNiunSum(int startRow, int startCol) {
        try {
            return grid[startRow][startCol] + grid[startRow + 1][startCol] + grid[startRow + 1][startCol + 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public static int getGiukSum(int startRow, int startCol) {
        try {
            return grid[startRow][startCol] + grid[startRow][startCol] + grid[startRow + 1][startCol + 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public static int getSecondBlockSum(int startRow, int startCol) {
        int horizontal = getHorizontalSum(startRow, startCol);
        int vertical = getVerticalSum(startRow, startCol);
        return Math.max(horizontal, vertical);
    }

    public static int getHorizontalSum(int startRow, int startCol) {
        try {
            return grid[startRow][startCol] + grid[startRow][startCol + 1] + grid[startRow][startCol + 2];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public static int getVerticalSum(int startRow, int startCol) {
        try {
            return grid[startRow][startCol] + grid[startRow + 1][startCol] + grid[startRow + 2][startCol];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();

        grid = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                max = Math.max(max, getFirstBlockSum(row, col));
                max = Math.max(max, getSecondBlockSum(row, col));
            }
        }
        System.out.println(max);
    }
}