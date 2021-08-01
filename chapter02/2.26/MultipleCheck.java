import java.util.Scanner;

public class MultipleCheck{

    public static void main(String[]args){
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int firstInteger= userInput.nextInt();
        System.out.println("Enter second integer:");
        int secondInteger= userInput.nextInt();
        if(secondInteger%firstInteger==0)
            System.out.printf("%d is a multiple of %d%n", firstInteger, secondInteger);
        if(secondInteger%firstInteger!=0)
            System.out.printf("%d is a not multiple of %d%n", firstInteger, secondInteger);

    }

}
