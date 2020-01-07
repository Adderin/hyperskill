package firstwave;

import java.util.Scanner;

    class Reversing {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            int first = num / 100;
            int second = (num / 10) % 10;
            int third = num % 10;
            System.out.println(third+""+second+first);
        }
    }
