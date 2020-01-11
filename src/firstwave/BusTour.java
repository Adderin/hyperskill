package firstwave;

import java.util.Scanner;

public class BusTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridgesTotal = scanner.nextInt();
        int bridgeNumber = 1;
        int crashBridgeNum = 0;
        boolean willCrash = false;
        while (bridgeNumber <= bridgesTotal) {
            int bridgeHeight = scanner.nextInt();
            if (!willCrash) {
                if (bridgeHeight > busHeight) {
                    bridgeNumber++;
                    continue;
                } else if (bridgeHeight <= busHeight) {
                    crashBridgeNum = bridgeNumber;
                    willCrash = true;
                }
            }
            bridgeNumber++;
        }
        if (willCrash) {
            System.out.println("Will crash on bridge " + crashBridgeNum);
        } else {
            System.out.println("Will not crash");
        }
    }
}