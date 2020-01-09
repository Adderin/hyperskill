package firstwave;

import java.util.Scanner;

public class CalculateProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();  // money at current time
        double p = scanner.nextDouble();  // percentage given
        double k = scanner.nextDouble();  // money after percentage given
        int years = 0;
        while(m < k){
            m = m * (1 + 0.01*p);
        years++;
        }
        System.out.println(years);
    }
}
