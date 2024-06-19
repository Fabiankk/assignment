// we need to import scanner which assists us collect data from user
import java.util.Scanner;

public class averageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store marks for five units
        double[] marks = new double[5];

        // ask user to enter marks for each unit
        System.out.println("Enter marks for five units:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Unit " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        // Calculate average of marks
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        double average = sum / 5;

        // Display the average with two decimal places
        System.out.printf("Average marks: %.2f\n", average);

        scanner.close();
    }
}
