package com.company.ThirdPhase;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("--- Start game ---");
        int counter = 1;
        for (int i = 3; i > 0; i--) {
            System.out.println("----------" + counter + "----------");
            counter++;
            System.out.print("\nPredict amount of points (2...12): ");
            int number1 = scanner.nextInt();
            if (number1 <= 12 && number1 >= 2) {
                int cube1 = random.nextInt(1, 6);
                int cube2 = random.nextInt(1, 6);
                rollTheDice(cube1);
                rollTheDice(cube2);
                int totalPoints1 = cube1 + cube2;
                System.out.println("On the dice fell " + totalPoints1 + " points.");
                int result1 = totalPoints1 - Math.abs(totalPoints1 - number1) * 2;
                System.out.println("Result is " + totalPoints1 + " - Math.abs(" + totalPoints1 + " - " + number1 + ") * 2) = " + result1 + " points.");
                int number2 = random.nextInt(2,12);
                int cube3 = random.nextInt(1,6);
                int cube4 = random.nextInt(1,6);
                rollTheDice(cube3);
                rollTheDice(cube4);
                int totalPoints2 = cube3 + cube4;
                System.out.println("On the dice fell " + totalPoints2 + " points.");
                int result2 = totalPoints2 - Math.abs(totalPoints2 - number2) * 2;
                System.out.println("Result is " + totalPoints2 + " - Math.abs(" + totalPoints2 + " - " + number2 + ") * 2) = " + result2 + " points.");
                System.out.println("\n-------- Current store --------");
                System.out.println("User " + result1);
                System.out.println("Computer " + result2);
                if (result1 > result2) {
                    int total1 = result1 - result2;
                    System.out.println("User is ahead by " + total1 + " points!");
                } else if (result1 < result2) {
                    int total2 = result2 - result1;
                    System.out.println("Computer is ahead by " + total2 + " points!");
                } else {
                    System.out.println("User and Computer by" + result1 + " and " + result2 + " points");
                }
                System.out.println("--------------------------------------");
                if (counter > 3) {
                    System.out.println("---------- Finish game ----------");
                    System.out.println("Round  |     User    |    Computer  \n" +
                            "-----------------------------------------------\n" +
                            "-" + counter + "-" + "   | Predicted:" + number1 + "|  Predicted:" + number2);
                }
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
