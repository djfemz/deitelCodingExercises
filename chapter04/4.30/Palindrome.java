/*
ask user for a five digit integer 
check the length of the integer 
    if the length of the integer is not equal to 5 then, ask for integer again
    if the length of the integer is 5
        compare the first and second digits to the fifth and fourth digits respectively
            if the first digit is the same as the fifth digit and the second digit is the same as the fourth digit
                tell the user that the number is a palindrome
            if the first digit is NOT the same as the fifth digit or the second digit is NOT the same as the fourth digit
                tell the user that the number is not a palindrome
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String userInputAsAString;
        int userInput;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit integer: ");
        userInput= input.nextInt();
       userInputAsAString=String.valueOf(userInput);

       while (userInputAsAString.length()!=5) {
        System.out.println("Integer is invalid");   
        System.out.println("Enter a five digit integer:");
        userInput= input.nextInt();
        userInputAsAString=String.valueOf(userInput);
       }

       if (userInputAsAString.length()== 5){
        for (int i = 0; i <userInputAsAString.length()-2;i++) {
            if (userInputAsAString.charAt(i)!=userInputAsAString.charAt(userInputAsAString.length()-(i+1))){
                System.out.println("checking..."); 
                System.out.println("Number is not a palindrome");  
                System.exit(1);
            }
        }
       }
       System.out.println("checking..."); 
       System.out.println("Number is a palindrome");   
       input.close();
    }
}
