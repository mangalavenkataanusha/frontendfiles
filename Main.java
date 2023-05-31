import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of polyline's endpoints
        System.out.print("Enter the number of polyline's endpoints: ");
        int n = scanner.nextInt();

        // Read the number of papers
        System.out.print("Enter the number of papers: ");
        int k = scanner.nextInt();

        // Initialize variables
        double totalLength = 0.0;

        // Read the coordinates of the polyline's endpoints
        double prevX = scanner.nextDouble();
        double prevY = scanner.nextDouble();
	  System.out.println("Enter the coordinates of polyline's endpoint 1: ");

        for (int i = 2; i <= n; i++) {
            System.out.println("Enter the coordinates of polyline's endpoint " + i + ": ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            totalLength += Math.sqrt(Math.pow(x - prevX, 2) + Math.pow(y - prevY, 2));
            prevX = x;
            prevY = y;
        }

        // Calculate the total time wasted in seconds
        double totalSeconds = totalLength / 50 * k;

        // Display the total time wasted
        System.out.printf("The total time wasted on signing the papers in seconds = %.2f%n", totalSeconds);

        scanner.close();
    }
}