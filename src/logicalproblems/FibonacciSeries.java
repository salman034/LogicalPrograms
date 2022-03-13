package logicalproblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number1 = 0, Number2 =1;
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        System.out.println("First " + number + " terms of fibonnci series ");
        scanner.close();

        for (int i = 1; i <= number; ++i)
        {
            System.out.println(Number1 + " ");
            int Sum = Number1 + Number2;
            Number1 = Number2;
            Number2 = Sum;
        }
    }
}
