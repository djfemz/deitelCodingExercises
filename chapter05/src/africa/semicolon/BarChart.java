package africa.semicolon;
import java.util.Scanner;
public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scoreCounter=1;
        int userInput=0;
        int firstUserInput=0;
        int secondUserInput=0;
        int thirdUserInput=0;
        int fourthUserInput=0;
        int fifthUserInput=0;


        while(scoreCounter<6){
            System.out.println("Enter score"+ " " + String.valueOf(scoreCounter)+":");
            userInput= scanner.nextInt();
            if (scoreCounter==1 && userInput>=0 && userInput<=30){
                firstUserInput=userInput;
            }
            if (scoreCounter==2 && userInput>0 && userInput<=30){
                secondUserInput=userInput;

            }
            if (scoreCounter==3 && userInput>0 && userInput<=30){
                thirdUserInput=userInput;

            }
            if (scoreCounter==4 && userInput>0 && userInput<=30){
                fourthUserInput=userInput;

            }
            if (scoreCounter==5 && userInput>0 && userInput<=30){
                fifthUserInput=userInput;
            }

            scoreCounter++;
        }

        for (int barCounter=1; barCounter<=firstUserInput; barCounter++){
            System.out.print("*");
        }

        System.out.print("   ");

        for (int barCounter=1; barCounter<=secondUserInput; barCounter++){
            System.out.print("*");
        }

        System.out.print("   ");

        for (int barCounter=1; barCounter<=thirdUserInput; barCounter++){
            System.out.print("*");
        }

        System.out.print("  ");

        for (int barCounter=1; barCounter<=fourthUserInput; barCounter++){
            System.out.print("*");
        }

        System.out.print("   ");

        for (int barCounter=1; barCounter<=fifthUserInput; barCounter++){
            System.out.print("*");
        }

        System.out.print("   ");

    }

}
