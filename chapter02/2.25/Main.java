import java.util.Scanner;

public class Main{

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int userInput;
        System.out.println("Enter an integer:");
        userInput= input.nextInt();
        if (userInput%2==0)
        System.out.println("Inputed Number is an even Number");
        if (userInput%2!=0)
        System.out.println("Inputed Number is an odd Number");
        

    }

}
