package semicolon.heartrates;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRatesTest {
    HeartRates user;
    @BeforeEach
    void setUp() {
        user = new HeartRates("John", "Doe", "October", 24, 1995);
    }

    @Test
    void testThatUserDetailsCanBeSaved() {
        assertEquals("John", user.getFirstName());
        assertEquals("Doe", user.getLastName());
        assertEquals("October", user.getBirthMonth());
        assertEquals(24, user.getBirthDay());
        assertEquals(1995, user.getBirthYear());
    }

    @Test
    void testThatUserDetailsCanBeSet() {
        assertEquals("John", user.getFirstName());
        assertEquals("Doe", user.getLastName());
        assertEquals("October", user.getBirthMonth());
        assertEquals(24, user.getBirthDay());
        assertEquals(1995, user.getBirthYear());

        user.setFirstName("Ken");
        assertEquals("Ken", user.getFirstName());
        user.setLastName("Adam");
        assertEquals("Adam", user.getLastName());
        user.setBirthMonth("June");
        assertEquals("June", user.getBirthMonth());
        user.setBirthDay(30);
        assertEquals(30, user.getBirthDay());
        user.setBirthYear(1999);
        assertEquals(1999, user.getBirthYear());


    }

    @Test
    void testThatUsersAgeCanBeCalculated() {
        assertEquals(26, user.getAge());
    }

    @Test
    void testThatUsersMaximumHeartRateCanBeCalculated() {
        user.calculateMaximumHeartRate();
        assertEquals(194, user.getMaximumHeartRate());
    }

    @Test
    void testThatUsersTargetHeartRateCanBeCalculated() {
        user.calculateMaximumHeartRate();
        user.calculateTargetHeartRate();
        assertEquals("97.0 to 164.9", user.getTargetHeartRate());
    }


    @Test
    void testThatUsersInformationCanBeDisplayed() {
        user.calculateMaximumHeartRate();
        user.calculateTargetHeartRate();
        String userInformation = """
                Name: John Doe
                DOB: 24 October 1995
                Age: 26
                MaxHeartRate: 194
                TargetHeartRate: 97.0 to 164.9""";
        assertEquals(userInformation, user.getDetails());
    }
}