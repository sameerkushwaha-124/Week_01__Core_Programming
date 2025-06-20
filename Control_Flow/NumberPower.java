import java.util.Scanner;
public class NumberPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        
        int result = 1; 
        int counter = 0; 
        
        while (counter < power) {
            result *= number; 
            counter++;
        }
        
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        
        scanner.close();
    }
}