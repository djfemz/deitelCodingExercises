/**
 * Collect Encrypted 4-digit integer from the user
 * verify that the integer the user enters is a valid 4-digit integer
 *      if step 2 checks out to be true;
 *          Decrypt the encrypted integer entered by the user
 *      if step 2 checks out to be false;
 *          Warn the user and repeat step 1.
 * 
 */

 import java.util.Scanner;

public class DataDecryption {
    public static void main(String[] args) {
        int userInput = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Data to decrypt:");
        userInput = scanner.nextInt();
        String userInputAsAString=String.valueOf(userInput);

        int decryptedFirstDigit=0;
        int decryptedSecondDigit=0;
        int decryptedThirdDigit=0;
        int decryptedFourthDigit=0;

        while (userInputAsAString.length()!=4){
            System.out.println("Warning: Invalid Integer");
            System.out.println("Enter Data to decrypt:");
            userInput = scanner.nextInt();
            userInputAsAString=String.valueOf(userInput);
        }

        int firstDigitBeforeDecryption = userInput/1000;
        int secondDigitBeforeDecryption = (userInput%1000)/100; 
        int thirdDigitBeforeDecryption = (userInput%1000%100)/10;
        int fourthDigitBeforeDecryption = (userInput%10)/1;


        for (int counter = 0; counter <userInputAsAString.length(); counter++){
            if (counter == 0){
                 decryptedFirstDigit = (firstDigitBeforeDecryption+10) - 7;
                 if (decryptedFirstDigit > 10){
                    decryptedFirstDigit = decryptedFirstDigit - 10;
                 }
            }

            if (counter == 1){
                 decryptedSecondDigit = (secondDigitBeforeDecryption+10) - 7;
                 if (decryptedSecondDigit > 10){
                    decryptedSecondDigit = decryptedSecondDigit - 10;
                 }
            }

            if (counter == 0){
                 decryptedThirdDigit = (thirdDigitBeforeDecryption+10) - 7;
                 if (decryptedThirdDigit > 10){
                    decryptedThirdDigit = decryptedThirdDigit - 10;
                 }
            }

            if (counter == 0){
                 decryptedFourthDigit = (fourthDigitBeforeDecryption+10) - 7;
                 if (decryptedFourthDigit > 10){
                    decryptedFourthDigit = decryptedFourthDigit - 10;
                 }
            }

        }

        System.out.println(String.valueOf(decryptedThirdDigit)+decryptedFourthDigit+decryptedFirstDigit+decryptedSecondDigit);
        scanner.close();

    }
    
}
