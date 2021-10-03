package semicolon.africa;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter credit card number");
        Long cardNumber =  Long.parseLong(scanner.next());
        CreditCard.validate(cardNumber);
        System.out.println(CreditCard.isValid());
    }

}
