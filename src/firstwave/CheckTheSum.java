package firstwave;

import java.util.Scanner;

public class CheckTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + b == 20 || b + c == 20 || a + c == 20);
    }
}
