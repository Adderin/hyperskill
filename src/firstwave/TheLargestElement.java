package firstwave;

import java.util.Scanner;

public class TheLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int temp = 0;
        do {
            num = scanner.nextInt();
            if(temp < num) {
                temp = num;
            }
        } while( num != 0 );
        System.out.println(temp);
    }
}