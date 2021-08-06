public class ChristmasSong {
    public static void main(String[] args) {

        String dayOne= "A partridge in a pear tree.";
        
        String dayTwo= "Two turtle doves,";

        String dayThree= "Three French hens,";

        String dayFour= "Four calling birds,";

        String dayFive= "Five golden rings,";

        String daySix= "Six geese a-laying,";

        String daySeven= "Seven swans a-swimming,";

        String dayEight= "Eight maids a-milking,";

        String dayNine= "Nine ladies dancing,";

        String dayTen= "Ten lords a-leaping,";

        String dayEleven= "Eleven pipers piping,";

        String dayTwelve= "Twelve drummers drumming,";
        
        int counter = 1;
        while (counter <13){
            switch (counter) {
                case 1:
                System.out.println("On the first day Of Christmas my true love sent to me:");
                break;
                case 2:
                System.out.println("On the second day Of Christmas my true love sent to me:");
                break;

                case 3:
                System.out.println("On the third day Of Christmas my true love sent to me:");
                break;

                case 4:
                System.out.println("On the fourth day Of Christmas my true love sent to me:");
                break;

                case 5:
                System.out.println("On the fifth day Of Christmas my true love sent to me:");
                break;

                case 6:
                System.out.println("On the sixth day Of Christmas my true love sent to me:");
                break;

                case 7:
                System.out.println("On the seventh day Of Christmas my true love sent to me:");
                break;

                case 8:
                System.out.println("On the eight day Of Christmas my true love sent to me:");
                break;

                case 9:
                System.out.println("On the ninth day Of Christmas my true love sent to me:");
                break;

                case 10:
                System.out.println("On the tenth day Of Christmas my true love sent to me:");
                break;

                case 11:
                System.out.println("On the eleventh day Of Christmas my true love sent to me:");
                break;

                case 12:
                System.out.println("On the twelfth day Of Christmas my true love sent to me:");
                break;
            
                default:
                break;
            }

            switch (counter) {
                case 1:
                System.out.printf("%s%n", dayOne);
                System.out.println("");  
                    break;

                case 2:
                System.out.printf("%s%n%s %s%n", dayTwo, "and", dayOne);
                System.out.println("");  
                    break;

                case 3:
                System.out.printf("%s%n%s%n%s %s%n", dayThree, dayTwo, "and", dayOne);
                System.out.println("");  
                    break;

                case 4:
                System.out.printf("%s%n%s%n%s%n%s %s%n", dayFour, dayThree, dayTwo, "and", dayOne);
                System.out.println("");      
                    break;

                case 5:
                System.out.printf("%s%n%s%n%s%n%s%n%s %s%n", dayFive, dayFour, dayThree, dayTwo, "and", dayOne);
                System.out.println("");      
                    break;

                case 6:
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s %s%n", daySix, dayFive, dayFour, dayThree, dayTwo, "and", dayOne);
                System.out.println("");     
                    break;

                case 7:
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s %s%n", daySeven, daySix, dayFive, dayFour, dayThree, dayTwo, "and",dayOne);
                System.out.println("");   
                    break;

                case 8:
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s %s%n", dayEight, daySeven, daySix, dayFive, dayFour, dayThree, dayTwo, "and", dayOne);
                System.out.println("");      
                    break;

                case 9:
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s %s%n", dayNine, dayEight, daySeven, daySix, dayFive, dayFour, dayThree, dayTwo, "and", dayOne);
                System.out.println("");      
                    break;

                case 10:
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s %s%n", dayTen, dayNine, dayEight, daySeven, daySix, dayFive, dayFour, dayThree, dayTwo, "and", dayOne);
                System.out.println("");  
                    break;

                case 11:
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s %s%n",dayEleven, dayTen, dayNine, dayEight, daySeven, daySix, dayFive, dayFour, dayThree, dayTwo, "and", dayOne);
                System.out.println("");      
                    break;

                case 12:
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s %s%n",dayTwelve, dayEleven, dayTen, dayNine, dayEight, daySeven, daySix, dayFive, dayFour, dayThree, dayTwo, "and", dayOne);
                System.out.println("");      
                    break;

                default:
                    break;
            }

                counter++;
        }
    }
    
    
}
