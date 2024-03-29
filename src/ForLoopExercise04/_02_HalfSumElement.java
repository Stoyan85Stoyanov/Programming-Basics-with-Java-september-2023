package ForLoopExercise04;

import java.util.Scanner;

public class _02_HalfSumElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;

            if (maxNumber < currentNumber) {
                maxNumber = currentNumber;
            }
        }

        int sumOther = sum - maxNumber;

        if (maxNumber == sumOther) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxNumber - sumOther));

        }
    }
}
