import java.util.Scanner;

public class Main {
public static int convertToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Please enter a valid integer.");
            return 0;
        }
    }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number: ");
 String input = sc.nextLine();
 int result = convertToInt(input);
 System.out.println("Integer value: " + result);
 sc.close();
    }
}