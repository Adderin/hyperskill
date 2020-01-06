/*
Given three natural numbers A, B, C. Determine if a triangle with these sides can exist.
If the triangle exists, output the YES string, and otherwise, output NO.
*/
package firstwave;

import java.util.Scanner;

public class TriangleExists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
