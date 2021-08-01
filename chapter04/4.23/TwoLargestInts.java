import java.util.Scanner;

/**
 * 1. create largestNumber and second largest number variables
 * 2. ask user to enter an integer
 * 3. check the integer entered 
 * 4.     if the integer entered is greater than the current largest number 
 * 5.         store it as the largest number
 * 6.     if the integer entered is greater than the current second largest number AND less than the current largest number
 * 7.         store it as the second largest number
 * 8. Steps  2-7 are repeated ten times where the user enters a valid integer
 * 9. The largest number and second largest number amongst the ten successive user inputs are outputed to the user  
 */


public class TwoLargestInts {
    public static void main(String[] args) {
        int userInput=0;
        int largestNumber=0;
        int secondLargestNumber=0;
        Scanner scanner = new Scanner(System.in);

        for (int counter = 0; counter <10;counter++) {

            System.out.println("Enter integer number " + (counter+1)+":");
            userInput = scanner.nextInt();

            if (userInput > largestNumber){
                secondLargestNumber=largestNumber;
                largestNumber = userInput;
            }else{
                if (userInput>secondLargestNumber&&userInput<largestNumber){
                        secondLargestNumber = userInput;
                }
            }       
            
        }

        System.out.printf("Largest number is %d%n", largestNumber);
        System.out.printf("Second Largest Number is %d%n", secondLargestNumber);
        scanner.close();
        
    }
}
