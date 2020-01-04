package firstwave;

import java.util.Scanner;

public class CheckTheValue  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num < 10 && num > 0);
    }
}
