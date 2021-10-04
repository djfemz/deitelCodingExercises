package semicolon.africa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {
    Long cardNumber;
    @BeforeEach
    void setUp() {
         cardNumber= Long.parseLong("4738857601840626");
    }

    @Test
    void testThatCreditCardNumberIsBetweenThirteenAndSixteenDigits() {
        assertTrue(CreditCard.validateLengthOfCardNumber(cardNumber));
    }

    @Test
    void testThatSumOfDoubleEvenPlacedDigitsCanBeFound() {
        assertEquals(37, CreditCard.sumOfDoubleEvenPlace(cardNumber));
    }

    @Test
    void testThatSumOfOddPlacedNumbersCanBeFound() {
        assertEquals(43, CreditCard.sumOfOddPlace(cardNumber));
    }

    @Test
    void testThatPrefixMatches() {
        assertTrue(CreditCard.prefixMatches(cardNumber, 4738));
    }

    @Test
    void creditCardValidation() {
        CreditCard.validate(cardNumber);
        assertTrue(CreditCard.isValid());
    }
}