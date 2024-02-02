package ConditionalStatementsAdvancedExercise03;

import java.util.Scanner;

public class _01_Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         String projection = scanner.nextLine();
         int rows = Integer.parseInt(scanner.nextLine());
         int columns = Integer.parseInt(scanner.nextLine());

         double price = 0.0;
         int totalSeats = rows * columns;

         switch (projection) {
             case "Premiere":
                 price = 12.00;
                 break;
             case "Normal":
                 price = 7.50;
                 break;
             case "Discount":
                 price = 5.00;
                 break;

         }
             System.out.printf("%.2f leva" , totalSeats * price);
        }
    }

