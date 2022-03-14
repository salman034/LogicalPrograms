package logicalproblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number, count = 0;
        System.out.println("Enter the number");
        Number = scanner.nextInt();
        scanner.close();

        for (int i = 1; i<= Number; i++)
            if (Number % i == 0)
                count++;
                else if (count == 2)
                    System.out.println("It is a prime Number");
            else
            {
                System.out.println("It is not a prime Number");
            }
    }
}
