/**
 1.  Collect  4-digit integer from the user
 2. verify that the integer the user enters is a valid 4-digit integer
 3.      if step 2 checks out to be true;
 4.          Encrypt the integer entered by the user
 5.      if step 2 checks out to be false;
 6.          Warn the user and repeat step 1. 
 */

import java.util.Scanner;

public class DataEncryption {
  
    public static void main(String[]args){
        int userInput = 0;
        int encryptedFirstDigit=0;
        int encryptedSecondDigit=0;
        int encryptedThirdDigit=0;
        int encryptedFourthDigit=0;

    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Data to Encrypt:");
        userInput = scanner.nextInt();
        String userInputAsAString = String.valueOf(userInput);
        
        while(userInputAsAString.length()!=4){
         System.out.println("Warning: Invalid data entry");
         System.out.println("Enter Data to Encrypt:");
         userInput = scanner.nextInt();
         userInputAsAString = String.valueOf(userInput);
        }

        int firstDigitBeforeFinalEncryption = userInput/1000;
        int secondDigitBeforeFinalEncryption = (userInput%1000)/100; 
        int thirdDigitBeforeFinalEncryption = (userInput%1000%100)/10;
        int fourthDigitBeforeFinalEncryption = (userInput%10)/1;

        for (int counter = 0; counter < userInputAsAString.length(); counter++){
          if (counter == 0) { 
             encryptedFirstDigit = (firstDigitBeforeFinalEncryption + 7) % 10;
          } 

          if (counter == 1) { 
             encryptedSecondDigit = (secondDigitBeforeFinalEncryption + 7) % 10;
          } 

          if (counter == 2) { 
             encryptedThirdDigit = (thirdDigitBeforeFinalEncryption + 7) % 10;
          } 

          if (counter == 3) { 
             encryptedFourthDigit = (fourthDigitBeforeFinalEncryption + 7) % 10;
          } 

        }

        System.out.printf("first digit is: %d%nsecond digit is %d%nthird digit is: %d%nfourth digit is: %d%n", encryptedFirstDigit, encryptedSecondDigit, encryptedThirdDigit, encryptedFourthDigit);
        System.out.println(String.valueOf(encryptedThirdDigit)+encryptedFourthDigit+encryptedFirstDigit+encryptedSecondDigit);
    }
}


/*
        
       

       
    */