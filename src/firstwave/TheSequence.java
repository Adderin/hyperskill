package firstwave;

import java.util.Scanner;

public class TheSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                count++;
                if(count == num) {
                    return;
                }
            }
        }
    }
}
