package NestedLoopsMoreExercises07;

import java.util.Scanner;

public class _05_ChallengetheWedding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tablesMax = Integer.parseInt(scanner.nextLine());
        int tableCounter = 0;

        for (int m = 1; m <= men; m++) {
            for (int f = 1; f <= women; f++) {
                System.out.printf("(%d <-> %d) ", m, f);
                tableCounter++;
                if (tableCounter == tablesMax) {
                    return;
                }
            }
        }
    }
}
