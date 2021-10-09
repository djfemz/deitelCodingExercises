package semicolon.heartrates;

import java.util.Scanner;

public class HeartRatesMain {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       String firstName = collectFirstName();
       String lastName = collectLastName();
       String birthMonth = collectBirthMonth();
       int dayOfBirth = collectDayOfBirth();
       int yearOfBirth = collectYearOfBirth();
        HeartRates user = new HeartRates(firstName, lastName, birthMonth, dayOfBirth, yearOfBirth);
        user.calculateMaximumHeartRate();
        user.calculateTargetHeartRate();
        System.out.println(user.getDetails());
    }

    public static String collectFirstName() {
        System.out.println("Enter your First Name");
        return scanner.nextLine();
    }

    public static String collectLastName() {
        System.out.println("Enter your Last Name");
        return scanner.nextLine();
    }

    public static String collectBirthMonth() {
        System.out.println("Enter your Month Of Birth");
        return scanner.nextLine();
    }

    public static int collectDayOfBirth(){
        System.out.println("Enter your Day Of Birth");
        return scanner.nextInt();
    }

    public static int collectYearOfBirth(){
        System.out.println("Enter your Year Of Birth");
       return scanner.nextInt();
    }
}
