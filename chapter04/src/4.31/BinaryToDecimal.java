/*
ask user to enter a binary integer
ascertain the length of the binary integer entered by the user
take each digit and check to see if it is a valid binary digit
    if all digits are valid binary digits, 
        convert inputed binary integer to decimal and display result to user.
    if any of the digits entered as part of the binary integer is not a valid binary digit
         alert the user and exit the program.
*/
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        double divisor = 10;
        int sum = 0;
        double singleBinaryDigit;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Binary Integer:");
        int userInput = scanner.nextInt();

        String userInputAsAString = String.valueOf(userInput);
        int binaryDigitLength = userInputAsAString.length();

        int counter=0;
        while (counter < binaryDigitLength) {
            singleBinaryDigit= (userInput%Math.pow(divisor, (counter+1)))/(Math.pow(divisor, counter));
            int newDigit = (int)singleBinaryDigit;
            
            if (newDigit==0||newDigit==1){
                sum+=newDigit*Math.pow(2, counter);

            }else{
                System.out.println("invalid binary digit entered");
                System.exit(1);
            }
            counter++;
        }

        scanner.close();
        System.out.printf("Binary Digit %d converted to Decimal is %d%n", userInput, sum);  
        }
}
       
                 
        
    
    

