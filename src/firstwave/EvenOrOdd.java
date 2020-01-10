package firstwave;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String str = "";
        while (scanner.hasNext()) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num % 2 == 1) {
                str += "odd\n";
            } else {
                str += "even\n";
            }
        }
        System.out.println(str);
    }
}
