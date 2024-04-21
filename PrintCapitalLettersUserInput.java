import java.util.*;
public class PrintCapitalLettersUserInput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.println("Capital letters in the string:");
        printCapitalLetters(inputString);
    }

    public static void printCapitalLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
               System.out.print(ch+" ");
            }
    
        }
    
    }
    
}
