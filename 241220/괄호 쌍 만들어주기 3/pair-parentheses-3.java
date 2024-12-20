import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int n = input.length();

        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++){
                if(str.charAt(i) == '(' && str.charAt(j) == ')'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}