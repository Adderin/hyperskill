package firstwave;

import java.util.Scanner;

public class MaxElementDivBy4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int num, temp;

        do {
            num = scanner.nextInt();
        } while (num > 1000);

        for (int i = 0; i < num; i++) {
            temp = scanner.nextInt();
            if (temp % 4 == 0 && temp > max) {
                max = temp;
            }
        }
        System.out.println(max);
    }
}
