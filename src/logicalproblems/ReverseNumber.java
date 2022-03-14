package logicalproblems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int Number, Reverse = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer to Reverse");
        Number = scanner.nextInt();
        scanner.close();

        while (Number != 0)
        {
            Reverse = Reverse * 10;
            Reverse = Reverse + Number % 10;
            Number = Number / 10;
            System.out.println("The Reverse number is :" + Reverse);
        }
    }
}
