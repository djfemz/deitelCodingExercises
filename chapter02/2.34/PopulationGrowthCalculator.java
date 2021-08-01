import java.util.Scanner;
import java.lang.Math;

public class PopulationGrowthCalculator{

    public static void main(String[]args){
        //growth rate 1.1% anually
        /*

        Nt=Pert

        In this equation, (Nt) is the number of people at a future date, and     (P) is equal to the present population. Next to (P) is (e), which is the natural logarithm base of 2.71828; (r) represents the rate of increase divided by 100, and (t) represents the time period.
*/
        double growthRate = 1.1/100;
        Scanner userInput= new Scanner(System.in);
        System.out.println("Enter the world's 'current population:");
        long currentPopulation= userInput.nextInt();
        System.out.println("Enter the year:");
        int year= userInput.nextInt();
        double oneYearAfter = currentPopulation*(Math.pow(2.71828, growthRate*1));
        year++;
        System.out.printf("The Population in %d is projected to be:%f%n", year, oneYearAfter);
        double twoYearsAfter= oneYearAfter*(Math.pow(2.71828, growthRate*1));
        year++;
         System.out.printf("The Population in %d is projected to be:%f%n", year, twoYearsAfter);
        double threeYearsAfter= twoYearsAfter*(Math.pow(2.71828, growthRate*1));
        year++;
        System.out.printf("The Population in %d is projected to be:%f%n", year, threeYearsAfter);
        double fourYearsAfter= threeYearsAfter*(Math.pow(2.71828, growthRate*1));
        year++;
        System.out.printf("The Population in %d is projected to be:%f%n", year, fourYearsAfter);
        double fiveYearsAfter= fourYearsAfter*(Math.pow(2.71828, growthRate*1));
        year++;
        System.out.printf("The Population in %d is projected to be:%f%n", year, fiveYearsAfter);
    }

}
