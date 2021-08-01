import java.util.Scanner;

public class IntegerSign{

    public static void main(String[]args){
        
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter five Integers:");
        int firstInput = userInput.nextInt();
        int secondInput = userInput.nextInt();
        int thirdInput = userInput.nextInt();
        int fourthInput = userInput.nextInt();
        int fifthInput = userInput.nextInt();
        if (firstInput>0)
            System.out.println("First integer is Positive");
        if (firstInput<0)
            System.out.println("First integer is Negative");
        if (firstInput==0)
            System.out.println("First integer is Zero");
        if (secondInput>0)
            System.out.println("Second integer is Positive");
        if (secondInput<0)
            System.out.println("Second integer is negative");
        if (secondInput==0)
            System.out.println("Second integer is Zero");
        if (thirdInput>0)
            System.out.println("third integer is Positive");
        if (thirdInput<0)
            System.out.println("third integer is Positive");
         if (thirdInput==0)
            System.out.println("Third integer is Zero");
        if (fourthInput>0)
            System.out.println("fourth integer is Positive");
         if (fourthInput>0)
            System.out.println("fourth integer is Negative");
         if (fourthInput==0)
            System.out.println("Fourth integer is Zero");
        if (fifthInput>0)
            System.out.println("fifth integer is Positive");
        if (fifthInput<0)
            System.out.println("fifth integer is Positive");
         if (fifthInput==0)
            System.out.println("Fifth integer is Zero");
    }

}
