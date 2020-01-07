package firstwave;

import java.util.Scanner;

public class AllNumbersFromAtoB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long prod = 1;
        for(int i = a; i < b; i++){
            prod *= i;
        }
        System.out.print(prod);
    }
}