package com.company.FirstPhase;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("--- Start game ---");
        System.out.println("Predict amount of points (2...12):");
        int number1 = scanner.nextInt();
        System.out.println("Predict amount of points (2...12):" + number1);
        if (number1 <= 12 && number1 >= 2) {
            int cube1 = random.nextInt(1, 6);
            int cube2 = random.nextInt(1, 6);
            rollTheDice(cube1);
            rollTheDice(cube2);
            int totalPoints1 = cube1 + cube2;
            System.out.println("On the dice fell " + totalPoints1 + " points.");
            int result1 = totalPoints1 - Math.abs(totalPoints1 - number1) * 2;
            System.out.println("Result is " + totalPoints1 + " - Math.abs(" + totalPoints1 + " - " + number1 + ") * 2) = " + result1 + " points.");
            if (result1 > 0) {
                System.out.println("Users wins!");
            } else {
                System.out.println("Users lost!");
            }
        }
    }
    public static void rollTheDice(int cube) {
            switch (cube) {
                case 1:
                    System.out.println(
                            """
                                    +-------+
                                    |       |
                                    |   #   |
                                    |       |
                                    +-------+""");
                    break;
                case 2:
                    System.out.println(
                            """
                                    +-------+
                                    | #     |
                                    |       |
                                    |     # |
                                    +-------+""");
                    break;
                case 3:
                    System.out.println(
                            """
                                    +-------+
                                    | #   # |
                                    |   #   |
                                    |       |
                                    +-------+
                                    """);
                    break;
                case 4:
                    System.out.println(
                            """
                                    +-------+
                                    | #   # |
                                    |       |
                                    | #   # |
                                    +-------+""");
                    break;
                case 5:
                    System.out.println(
                            """
                                    +-------+
                                    | #   # |
                                    |   #   |
                                    | #   # |
                                    +-------+""");
                    break;
                case 6:
                    System.out.println(
                            """
                                    +-------+
                                    | #   # |
                                    | #   # |
                                    | #   # |
                                    +-------+""");
                    break;
        }
    }
}
