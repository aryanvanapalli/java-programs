# java-programs
assignment 1
program 1
class HelloWorld
 {
    public static void main(String[] args) 
	{
        System.out.println("welcome to java world");
    }
}
program2
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
program 3
import java.util.Scanner;

public class Variables_Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three number:");
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number:");
        int number3 = scanner.nextInt();

         int result_sum = (number1+number2+number3); 
         System.out.println("Enter sum of three numbers is:"+result_sum);
         int result_avg = ((number1+number2+number3)/3); 
         System.out.println("Enter avg of three numbers is:"+result_avg);
         int result_sub = (number1-number2-number3); 
         System.out.println("Enter sub of three numbers is:"+result_sub);
         int result_mul = (number1*number2*number3); 
         System.out.println("Enter mul of three numbers is:"+result_mul);
        
    }
}
__________________________________  _____________________________________________________________
