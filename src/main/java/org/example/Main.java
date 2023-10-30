package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the time or 'q' to quit: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting the program.");
                break;
            }

            try {
                double time = Double.parseDouble(input);
                double cycleTime = 5.0;
                String currentColor = "";
                if (time < 0.0) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    continue;
                }
                if (time < 3.0) {
                    currentColor = "green";
                } else if (time < 4.0) {
                    currentColor = "yellow";
                } else if (time < cycleTime) {
                    currentColor = "red";
                } else {
                    time %= cycleTime;
                    if (time < 3.0) {
                        currentColor = "green";
                    } else if (time < 4.0) {
                        currentColor = "yellow";
                    } else {
                        currentColor = "red";
                    }
                }

                System.out.println("The color is: " + currentColor);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        scanner.close();
    }
}
