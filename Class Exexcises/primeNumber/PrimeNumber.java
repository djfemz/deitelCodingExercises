/**
 *
 * PrimeNumber
 * Ask user for a number
 * check to see if the number can divide any number between one and itself that isnt one and the number itself   
 *          if such numbers exist tell the user that the number is not a prime number and exit the program
 *          tell the user that the number is a prime number and exit the program. 
 */
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        
        int userInput = 0;
        Scanner scanner = new Scanner(System.in);
        int counter=2;
    
        System.out.println("Enter a number:");
        userInput = scanner.nextInt();
        
        while(counter<userInput) {
            if (userInput%counter==0){
                System.out.printf("%d is not a prime number%n", userInput);
                System.exit(1);
            }
            counter++;
        }
        System.out.printf("%d is a prime number%n", userInput);
    }
   
}