package firstwave;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println("Leap");
                return;
            }
            else if (year % 100 == 0) {
                System.out.println("Regular");
                return;
            }
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}