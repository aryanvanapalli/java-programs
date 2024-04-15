import java.util.Scanner;

public class Variables_Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

         int result = (number1-number2); // Check if the two numbers are the same

        if (result==0) {
            System.out.println("The number 1 and number 2 are equal.");
        } else {
            System.out.println("The number 1 and number 2 are not equal.");
        }
    }
}
