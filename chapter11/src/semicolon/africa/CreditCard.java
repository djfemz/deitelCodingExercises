package semicolon.africa;

public class CreditCard {
    private static boolean isValid;


    public static boolean isValid() {
        return isValid;
    }

    public static boolean validateLengthOfCardNumber(Long cardNumber) {
        int cardNumberLength=String.valueOf(cardNumber).length();
        return cardNumberLength>=13 && cardNumberLength<=16;
    }

    private static boolean validateCreditCardType(Long cardNumber) {
        String creditCardStringValue= String.valueOf(cardNumber);
        int creditCardNumbersFirstDigit= creditCardStringValue.charAt(0);
        int creditCardNumbersSecondDigit= creditCardStringValue.charAt(1);
        return creditCardNumbersFirstDigit == '3' && creditCardNumbersSecondDigit == '7' || creditCardNumbersFirstDigit == '4' || creditCardNumbersFirstDigit == '5' || creditCardNumbersFirstDigit == '6';
    }


    public static int sumOfDoubleEvenPlace(Long cardNumber) {
        int total = 0;
        int cardNumberLength = cardNumber.toString().length();
        for (int count = cardNumberLength-2; count >=0; count=count-2) {
           int number= Character.getNumericValue(cardNumber.toString().charAt(count));
           int numberOne=getDigit(number*2);
            total +=numberOne;
        }
        return total;
    }

    private static int getDigit(int number) {
        int sum = 0;
        if (number<10) return number;
        else{
            String numberAsString=String.valueOf(number);
            for (int i = 0; i < numberAsString.length(); i++) {
                int newNumber = Character.getNumericValue(numberAsString.charAt(i));
                sum += newNumber;
            }
            return sum;
        }
    }


    public static int sumOfOddPlace(Long cardNumber) {
        int total=0;
        int cardNumberLength = cardNumber.toString().length();
        for (int count = cardNumberLength-1; count >=0; count=count-2) {
            int number= Character.getNumericValue(cardNumber.toString().charAt(count));
            total +=number;
        }
        return total;
    }

    public static boolean prefixMatches(Long cardNumber, int prefix) {
        int prefixLength = getSize(prefix);
        int returnedPrefix= getPrefix(cardNumber, prefixLength);
        return returnedPrefix == prefix;
    }

    private static int getSize(int prefix) {
        return String.valueOf(prefix).length();
    }

    private static int getPrefix(Long cardNumber, int prefixLength) {
        StringBuilder prefixToReturnAsString = new StringBuilder();
        for (int counter = 0; counter < prefixLength; counter++) {
           prefixToReturnAsString.append(cardNumber.toString().charAt(counter));
        }
        if (cardNumber.toString().length() < prefixLength) return cardNumber.intValue();
        else return Integer.parseInt(String.valueOf(prefixToReturnAsString));
    }

    public static void validate(Long cardNumber) {
        if (validateCreditCardType(cardNumber) && validateLengthOfCardNumber(cardNumber)
                && (sumOfDoubleEvenPlace(cardNumber) + sumOfOddPlace(cardNumber))%10==0) isValid = true;
    }
}
