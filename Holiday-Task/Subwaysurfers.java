import java.util.Scanner;

public class Subwaysurfers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int choice;

        System.out.println("=== Subway Surfers Game ===");

        do {
            System.out.println("\nChoose action:");
            System.out.println("1. Run");
            System.out.println("2. Jump");
            System.out.println("3. Slide");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("🏃 You are running...");
                    score += 10;
                    break;

                case 2:
                    System.out.println("🦘 You jumped over obstacle!");
                    score += 20;
                    break;

                case 3:
                    System.out.println("😎 You slid under barrier!");
                    score += 15;
                    break;

                case 4:
                    System.out.println("Game Over!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Current Score: " + score);

        } while(choice != 4);

        System.out.println("Final Score: " + score);

        sc.close();
    }
}
