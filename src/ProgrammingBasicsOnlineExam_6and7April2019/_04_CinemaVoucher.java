package ProgrammingBasicsOnlineExam_6and7April2019;

import java.util.Scanner;

public class _04_CinemaVoucher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());

        int tickets = 0;
        int otherStuff = 0;

        String product = scanner.nextLine();

        while (!"End".equals(product)) {
            int price = 0;
            if (product.length() > 8) {
                price = product.charAt(0);
                price += product.charAt(1);
                if (budget - price < 0) {
                    break;
                } else {
                    tickets++;
                    budget -= price;
                }
            } else {
                price = product.charAt(0);
                if (budget - price < 0) {
                    break;
                } else {
                    otherStuff++;
                    budget -= price;
                }
            }
            product = scanner.nextLine();
        }
        System.out.println(tickets);
        System.out.println(otherStuff);
    }
}
