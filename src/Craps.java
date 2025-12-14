import java.util.Random;
import java.util.Scanner;

    public class Craps

{


    public static void main(String[] args) {
        System.out.println("Love does not cost a Thing!");
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        int point = 0;
        int w = 0;
        int l = 0;
        int noGood = 0;
        String playAgain2 = "";

        System.out.println("Starting the game!");

        while (playAgain) {
            System.out.println("Rolling the dice:");
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;
            System.out.println("Die 1's value is: " + die1 + " ,  Die 2's value is: " + die2);
            System.out.println("The sum is: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You Crapped out! ");
                l += 1;
                do {
                    if (noGood > 0) {
                        System.out.print("Invalid input. ");
                    }
                    System.out.print("Would you like to play again? (y/n): ");
                    noGood += 1;
                    playAgain2 = scanner.nextLine();
                } while (!playAgain2.equals("n") && !playAgain2.equals("y"));

            } else if (sum == 7 || sum == 11) {
                System.out.println("You win the game of Craps!");
                w += 1;
                noGood = 0;
                do {
                    if (noGood > 0) {
                        System.out.print("Invalid input.");
                    }
                    System.out.print("Do you like to play again? (y/n) ");
                    noGood += 1;
                    playAgain2 = scanner.nextLine();
                } while (!playAgain2.equals("n") && !playAgain2.equals("y"));
            } else {
                point = sum;
                System.out.println("Your total amount of points are: " + point);
                do {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;
                    System.out.println("Your roll's value is: " + sum);
                    if (sum == 7) {
                        System.out.println("Crapped out!");
                        l += 1;
                        noGood = 0;
                        do {
                            if (noGood > 0) {
                                System.out.print("Invalid input.");
                            }
                            System.out.print("Would you like to play again? (y/n) ");
                            noGood += 1;
                            playAgain2 = scanner.nextLine();
                        } while (!playAgain2.equals("n") && !playAgain2.equals("y"));
                    } else if (sum == point) {
                        System.out.println("You win!");
                        w += 1;
                        noGood = 0;

                        do {
                            if (noGood > 0) {
                                System.out.print("Invalid input. ");
                            }
                            System.out.print("Would you like to play again? (y/n): ");
                            noGood += 1;
                            playAgain2 = scanner.nextLine();
                        } while (!playAgain2.equals("n") && !playAgain2.equals("y"));

                    } else {
                        System.out.println("Rolling again.");
                        die1 = rnd.nextInt(6) + 1;
                        die2 = rnd.nextInt(6) + 1;
                        sum = die1 + die2;
                    }
                } while (sum != 7 && sum != point);
            }
            if (playAgain2.equals("n") || playAgain2.equals("N")) {
                playAgain = false;
                System.out.println("Thanks for playing!");
            }
        }
    }
}





