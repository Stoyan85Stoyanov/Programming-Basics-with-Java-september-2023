package ProgrammingBasicsOnlineExam_15and16June2019;

import java.util.Scanner;

public class _04_MovieStars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String actorName = scanner.nextLine();

        while (!"ACTION".equals(actorName)) {

            if (actorName.length() > 15) {
                budget -= budget * 0.2;
            } else {
                double salary = Double.parseDouble(scanner.nextLine());
                budget -= salary;
            }

            if (budget < 0) {
                break;
            }

            actorName = scanner.nextLine();
        }

        if ("ACTION".equals(actorName)) {
            System.out.println(String.format("We are left with %.2f leva.", budget));
        } else {
            System.out.println(String.format("We need %.2f leva for our actors.", Math.abs(budget)));
            }
        }
    }

