import java.util.Scanner;

public class BodyMassCalculator{

    public static void main(String[]args){
        
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter your weight in Kilograms:");
        int userWeight = userInput.nextInt();
        System.out.println("Enter your height in meters:");
        int userHeight = userInput.nextInt();
       
        int bmi= userWeight/userHeight*userHeight;
        
    
        if (bmi<18.5)
            System.out.println("You are Underweight, Bulk Up!!!");
        if (bmi>18.5&&bmi<24.9)
            System.out.println("Optimal, Cheers!!!");
        if (bmi>24.9&&bmi<29.9)
            System.out.println("You are Overweight!!!");
        if (bmi>=30)
            System.out.println("You are Obese, lose Some Weight!!!");
        System.out.println("");
        
        System.out.printf("%s%n%s:%s%n%s:%s%n%s:%s%n%s:%s%n", "According to the Department of health and Human Services institute:", "Underweight", "less  than 18.5", "Normal", "between 18.5 and 24.9", "Overweight", "between 25 and 29.9", "Obese", "30 or greater");
        
    }

}
