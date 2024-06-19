
    import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check divisibility by integers from 1 to 9
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                if (i == 1) {
                    System.out.println(number + " is divisible by " + i + " because every integer is divisible by 1.");
                } else if (i == 5 && (number % 10 == 0 || number % 10 == 5)) {
                    System.out.println(number + " is divisible by " + i + " because it ends with " + number % 10);
                } else {
                    System.out.println(number + " is divisible by " + i);
                }
            }
        }

        scanner.close();
    }
}

