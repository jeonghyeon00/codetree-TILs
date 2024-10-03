import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                if(day > 31) {
                    System.out.println(-1);
                } else {
                    if(month >= 3 && month <= 5) {
                        System.out.println("Spring");
                    } else if(month >= 6 && month <= 8) {
                        System.out.println("Summer");
                    } else if(month >= 9 && month <= 11) {
                        System.out.println("Fall");
                    } else {
                        System.out.println("Winter");
                    }
                }
            }
            case 2 : {
                if(year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
                    if(day > 29) {
                        System.out.println(-1);
                    } else {
                        System.out.println("Winter");
                    }
                }
            }
            default: {
                if(day > 30) {
                    System.out.println(-1);
                } else {
                    if(month >= 3 && month <= 5) {
                        System.out.println("Spring");
                    } else if(month >= 6 && month <= 8) {
                        System.out.println("Summer");
                    } else if(month >= 9 && month <= 11) {
                        System.out.println("Fall");
                    } else {
                        System.out.println("Winter");
                    }
                }
            }

        }
    }
}