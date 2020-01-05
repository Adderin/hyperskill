/*
          Problem:    You are given coordinates of two queens on a chess board. Find out whether or not they hit each other.
          Input data format:   Four integer numbers x1, y1, x2, y2
          Output data format:  Type "YES" (uppercase) if they hit each other or "NO" if they don't.
*/
package firstwave;

import java.util.Scanner;

public class Queens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (x1 == x2) {
            System.out.println("YES");
        } else if (y1 == y2) {
            System.out.println("YES");
        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
