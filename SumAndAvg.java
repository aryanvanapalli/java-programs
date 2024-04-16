import java.util.Scanner;

public class SumAndAvg {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=scanner.nextInt();
        // Define the array to hold 8 elements
        int[] arr1 = new int[n];
        
        // Prompt the user to enter the elements
        System.out.println("Enter"+n+" elements:");

        // Input each element into the array
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Display the elements entered by the user
        System.out.println("\nElements entered by the user:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        double average = sum / arr1.length;

        System.out.println();
        // Display sum and average
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        

    }
}
