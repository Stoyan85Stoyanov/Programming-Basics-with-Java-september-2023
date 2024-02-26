package NestedLoopsMoreExercises07;

import java.util.Scanner;

public class _12_TheSongOfTheWheels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;


        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        boolean isValid = i < j && k > l && (i * j) + (k * l) == m;
                        if (isValid) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                            counter++;
                            if (counter == 4) {
                                a = i;
                                b = j;
                                c = k;
                                d = l;
                            }
                        }
                    }
                }
            }
        }
        if (counter >= 4) {
            System.out.println(" ");
            System.out.printf("Password: %d%d%d%d", a, b, c, d);
        } else {
            System.out.println(" ");
            System.out.print("No!");
        }
    }
}
