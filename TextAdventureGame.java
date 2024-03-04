import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Game introduction
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious place. Your choices will determine your fate.");

        // Start the game
        startGame(scanner);

        // Close the scanner
        scanner.close();
    }

    private static void startGame(Scanner scanner) {
        System.out.println("\nYou are standing at a crossroad. Which path will you choose?");
        System.out.println("1. Go left");
        System.out.println("2. Go right");

        int userChoice = getUserInput(scanner, 1, 2);

        if (userChoice == 1) {
            // Path 1
            pathLeft(scanner);
        } else {
            // Path 2
            pathRight(scanner);
        }
    }

    private static void pathLeft(Scanner scanner) {
        System.out.println("\nYou chose to go left. Ahead, you see a dark cave and a bridge.");
        System.out.println("1. Enter the cave");
        System.out.println("2. Cross the bridge");

        int userChoice = getUserInput(scanner, 1, 2);

        if (userChoice == 1) {
            // Cave
            System.out.println("\nYou entered the cave. It's cold and damp.");
            System.out.println("1. Explore the cave");
            System.out.println("2. Leave the cave");

            userChoice = getUserInput(scanner, 1, 2);

            if (userChoice == 1) {
                // Explore the cave
                System.out.println("\nYou found a hidden treasure! Congratulations, you win!");
            } else {
                // Leave the cave
                System.out.println("\nYou left the cave and continue your journey.");
            }

        } else {
            // Bridge
            System.out.println("\nYou crossed the bridge safely. On the other side, you encounter a friendly village.");
            System.out.println("Congratulations, you successfully navigated the adventure!");
        }
    }

    private static void pathRight(Scanner scanner) {
        System.out.println("\nYou chose to go right. In front of you, there is a dense forest and a mountain.");
        System.out.println("1. Enter the forest");
        System.out.println("2. Climb the mountain");

        int userChoice = getUserInput(scanner, 1, 2);

        if (userChoice == 1) {
            // Forest
            System.out.println("\nYou entered the forest. It's filled with tall trees and mysterious sounds.");
            System.out.println("1. Explore deeper into the forest");
            System.out.println("2. Leave the forest");

            userChoice = getUserInput(scanner, 1, 2);

            if (userChoice == 1) {
                // Explore deeper
                System.out.println("\nYou encountered a wild animal and managed to tame it. Congratulations, you win!");
            } else {
                // Leave the forest
                System.out.println("\nYou left the forest and continue your journey.");
            }

        } else {
            // Mountain
            System.out.println("\nYou decided to climb the mountain. It's a challenging journey, but you reach the summit.");
            System.out.println("Congratulations, you successfully navigated the adventure!");
        }
    }

    private static int getUserInput(Scanner scanner, int min, int max) {
        int userChoice;
        while (true) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                userChoice = scanner.nextInt();
                if (userChoice >= min && userChoice <= max) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume invalid input
            }
        }
        return userChoice;
    }
}
