import java.util.Scanner;

public class PrintHollowSquare {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of square:");
        int userInput = scanner.nextInt();
        printHorizontalLine(userInput);
        System.out.println();
        printVerticalLines(userInput);
        printHorizontalLine(userInput);
        System.out.println();

}

private static void printHorizontalLine(int userInput) {
    for (int i = 1; i <= userInput; i++) {
        System.out.print("* ");
    }
}

private static void printVerticalLines(int userInput) {
    for (int m = 1; m <= userInput-2; m++) {
        for (int j = 1; j <= userInput; j++) {
            if (j==1||j==userInput){
                System.out.print("*");
            }else{
                System.out.print("   ");
            }
        }
        System.out.println();
    }
}
   

}
