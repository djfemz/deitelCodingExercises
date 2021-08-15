public class NokiaThirtyThreeTen{

    public static String tones() {
        return """
                1-> Ringing Tone
                2-> Ringing volume
                3-> Incoming call alert
                4-> Composer
                5-> Message alert tone           
                6-> Keypad tones
                7-> Warning and game tones
                8-> Vibrating alert
                9-> Screen saver
                """;
    }

    public static String settings() {
        return """
        1-> Call settings
            1-> Automatic redial
            2-> Speed dialing
            3-> Call waiting options
            4-> Own number sending
            5-> Phone line in use
            6-> Automatic answer
        2-> Phone settings
            1-> Language
            2-> Cell info display
            3-> Welcome note
            4-> Network selection
            5-> Lights
            6-> Confirm SIM service actions
        3-> Security settings
            1-> PIN code request
            2-> Call barring service
            3-> Fixed dialing
            4-> Closed user group
            5-> Phone security
            6-> Change access codes
        4-> Restore factory settings
        """;
    }

    public static String callDivert() {
        return "Call divert: off";
    }

    public static String games() {
        return """
                 Snake
                 Space impact
                 Bounce
                """;
    }

    public static String calculator() {
        return """
                Add
                Subtract
                Multiply
                Divide
                """;
    }

    public static String reminders() {
        return """
                Set reminder
                View reminder history
                """;
    }

    public static String profiles() {
        return """
                General
                Silent
                Meeting
                Outdoor
                """;
    }

    public static String simServices() {
        return """
                Call service provider
                Send message
                """;
    }

    public static String clock() {
        return """
                1-> Alarm clock
                2-> Clock settings
                3-> Date setting
                4-> Stopwatch
                5-> Countdown timer          
                6-> Auto update of date and time
                """;
    }

    public static String homeMenu() {
        return """
                1-> Phonebook
                2-> Messages
                3-> Chat
                4-> Call register
                5-> Tones
                6-> Settings
                7-> Call divert
                8-> Games
                9-> Calculator
                10-> Reminders
                11-> Clock
                12-> Profiles
                13-> SIM services
                """;
    }

    public static String phoneBook() {
        return """
                1-> Search
                2-> Service Nos.
                3-> Add name
                4-> Erase
                5-> Edit
                6-> Assign Tone
                7-> Send b'card
                8-> Options
                    1-> Type of view
                    2-> Memory status
                9-> Speed dials
                10-> Voice tags
                """;
    }

    public static String message() {
        return """
                1-> Write messages
                2-> Inbox
                3-> Outbox
                4-> Picture messages
                5-> Templates
                6-> Smileys
                7-> Message settings
                    1-> Set 1
                        1-> Message center number
                        2-> Messages sent as
                        3-> Message validity
                    2-> Common
                        1-> Delivery reports
                        2-> Reply via same centre
                        3-> Character Support
                8-> Info service
                9-> Voice mailbox number
                10-> Service command editor
                """;
    }

    public static String chat() {
        return "new chat opened";
    }

    public static String callRegister() {
        return """
                1-> Missed calls
                2-> Received calls
                3-> Dialled numbers
                4-> Erase recent call lists
                5-> Show call duration
                    1-> Last call duration
                    2-> All calls duration
                    3-> Received calls duration
                    4-> Dialled calls duration
                    5-> Clear timers
                6-> Show call costs
                    1-> Last call cost
                    2-> All calls cost
                    3-> Clear counters
                7-> Call cost settings
                    1-> Call cost limit
                    2-> Show costs in
                8-> Prepaid credit
                """;
    }
}
