package firstwave;

import java.util.Scanner;

public class TheIntegerBarrier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;
        while (scanner.hasNext()) {
            number = scanner.nextInt();
            sum += number;
            if (number == 0 || sum >= 1000) {
                break;
            }
        }
        if (sum >= 1000) {
            System.out.println(sum - 1000);
        } else {
            System.out.println(sum);
        }
    }
}
