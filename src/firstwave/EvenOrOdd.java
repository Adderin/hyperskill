package firstwave;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1;
        String str = "";
        while (num > 0) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num % 2 == 1) {
                str += "odd\n";
            } else if(num % 2 == 0) {
                str += "even\n";
            }
        }
        System.out.println(str);
    }
}
