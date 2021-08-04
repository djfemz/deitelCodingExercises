/**
 * collect a number from the user
 * divide the number by every number between one and itself 
 *      all numbers between one and the user input which divide the number without leaving a remainder are outputed as multiples of the number
 *  if there aren't any numbers that divide the number between one and the user input
 *      tell the user that the number is a prime number and has only one and itself as multiples
 */
import java.util.Scanner;

public class Multiple {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int userInput = scanner.nextInt();

        int counter= 1;
        while (counter<=userInput) {
            if (counter<userInput&&userInput%counter==0){
                System.out.printf("%d, ", counter);
            }
            if (counter==userInput){
                System.out.printf("%d are factors of %d.%n", counter, userInput);
            }
            counter++;
        }
    }
}
