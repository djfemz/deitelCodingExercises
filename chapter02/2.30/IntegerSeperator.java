import java.util.Scanner;

public class IntegerSeperator{

    public static void main(String[]args){
        
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter a five Digit Integer:");
        int input = userInput.nextInt();
        
        int rem1= input/10000;
        int rem2= input%10000/1000;
        int rem3= input%10000%1000/100;
        int rem4= input%1000%100/10;
        int rem5= input%10/1;
        
       if (rem1>0)
        System.out.printf("%2d%2d%2d%2d%2d%n", rem1, rem2, rem3, rem4, rem5);
       if (rem1<1)
        System.out.println("Invalid Integer, enter a five-digit integer");
    }
  
}
