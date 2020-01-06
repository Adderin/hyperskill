package firstwave;

import java.util.Scanner;

public class SymmetricalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int first = num / 1000;  //first
        int second = num / 100 % 10;   //second
        int third = num / 10 % 10;  //third
        int fourth = num % 10;  //fourth
        if(second == third && first == fourth){
            System.out.println(1);
        } else {System.out.println((int)(Math.random()*10));}
    }
}