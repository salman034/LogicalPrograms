package logicalproblems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int i, Number, Sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        Number = scanner.nextInt();
        scanner.close();

        for (i = 1; i < Number; i++) {
            if (Number % i == 0)
                Sum = Sum + i;
                else if (Sum == Number)
                    System.out.println("Perfect number: " + Number);
            else {
                System.out.println("Not a perfect number:" + Number);
            }
        }
    }
}
