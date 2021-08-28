import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(NokiaThirtyThreeTen.homeMenu());
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
                System.out.println(NokiaThirtyThreeTen.phoneBook());
                userInput = scanner.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("search here:");
                    case 2 -> System.out.printf("service nos.:%n%d%n%d%n%d", 121, 123, 126);
                    case 3 -> System.out.println("Name added:");
                    case 4 -> System.out.println("Contact Erased");
                    case 5 -> System.out.println("select contact to edit");
                    case 6 -> System.out.println("select tone");
                    case 7 -> System.out.println("b'card sent");
                    case 8 -> {
                        System.out.println("""
                                1-> Type of view
                                2-> Memory status
                                """);
                        userInput = scanner.nextInt();
                        switch (userInput) {
                            case 1 -> System.out.println("select view");
                            case 2 -> System.out.println("2MB left of 64MB");
                        }
                    }
                    case 9 -> System.out.printf("Speed dials:%n%s%n%s%n%s%n", "dad", "wifey", "nepa");
                    case 10 -> System.out.println("voice tags:");
                }
                break;
            case 2:
                System.out.println(NokiaThirtyThreeTen.message());
                userInput = scanner.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Type message here:");
                    case 2 -> System.out.println("No new messages");
                    case 3 -> System.out.println("No messages in outbox");
                    case 4 -> System.out.println("Picture messages:");
                    case 5 -> System.out.println("Select templates");
                    case 6 -> System.out.println(":) (: -:)");
                    case 7 -> {
                        System.out.println("""
                                1-> Set 1
                                   1-> Message Center number
                                   2-> Messages sent as
                                   3-> Message validity
                                2-> Common
                                   1-> Delivery reports
                                   2-> Reply via same center
                                   3-> Character support
                                   """);
                        userInput = scanner.nextInt();
                        switch (userInput) {
                            case 1 -> {
                                System.out.println("""
                                        1-> Message Center number
                                        2-> Messages sent as
                                        3-> Message validity""");
                                userInput = scanner.nextInt();
                                switch (userInput) {
                                    case 1 -> System.out.println("message center number: 121");
                                    case 2 -> System.out.println("messages sent as user");
                                    case 3 -> System.out.println("message validity: 30 days");
                                }
                            }
                            case 2 -> {
                                System.out.println("""            
                                        1-> Delivery reports
                                        2-> Reply via same center
                                        3-> Character support""");
                                userInput = scanner.nextInt();
                                switch (userInput) {
                                    case 1 -> System.out.println("No delivery reports yet");
                                    case 2 -> System.out.println("type reply");
                                    case 3 -> System.out.println("No character support yet");
                                }
                            }
                        }
                    }
                    case 8 -> System.out.println("info service clicked");
                    case 9 -> System.out.println("voice mailbox number: 12011");
                    case 10 -> System.out.println("service command editor clicked");
                }
                break;
            case 3:
                System.out.println(NokiaThirtyThreeTen.chat());
                break;
            case 4:
                System.out.println(NokiaThirtyThreeTen.callRegister());
                userInput = scanner.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Missed calls:");
                    case 2 -> System.out.println("Received calls:");
                    case 3 -> System.out.println("Dialled numbers:");
                    case 4 -> System.out.println("Recent calls erased");
                    case 5 -> {
                        System.out.println(""" 
                                1-> Last call duration
                                2-> All calls duration
                                3-> Received calls duration
                                4-> Dialled calls duration
                                5-> Clear timers""");
                        userInput = scanner.nextInt();
                        switch (userInput) {
                            case 1 -> System.out.println("Last call duration: 1:00");
                            case 2 -> System.out.println("All calls duration: 1:30:50");
                            case 3 -> System.out.println("Received calls duration: 30:50");
                            case 4 -> System.out.println("Dialled calls duration: 1:00:00");
                            case 5 -> System.out.println("timers cleared");
                        }
                    }

                    case 6 -> {
                        System.out.println("""  
                                1-> Last call cost
                                2-> All calls cost
                                3-> Clear counters
                                """);
                        userInput= scanner.nextInt();
                        switch (userInput){
                            case 1 -> System.out.println("Last call cost: #5");
                            case 2 -> System.out.println("All calls cost: #125");
                            case 3 -> System.out.println("counters cleared");
                        }
                    }

                    case 7 -> {
                        System.out.println("""
                                1-> Call cost limit
                                2-> Show costs in""");
                        userInput= scanner.nextInt();
                        switch (userInput){
                            case 1 -> System.out.println("Call cost limit: #5000");
                            case 2 -> System.out.println("Show costs in: Naira");

                        }
                    }
                    case 8 -> System.out.println("Prepaid credit:#10000");
                    
                }
                
            case 5:
                System.out.println(NokiaThirtyThreeTen.tones());
                userInput = scanner.nextInt();
                switch (userInput){
                    case 1 -> System.out.println("Ringing Tone: Nokia tune");
                    case 2 -> System.out.println("Ringing volume: 5");
                    case 3 -> System.out.println("Incoming call alert: Ring");
                    case 4 -> System.out.println("Composer open");
                    case 5 -> System.out.println("Message alert tone: Mozart 40");
                    case 6 -> System.out.println("Keypad tones: on");
                    case 7 -> System.out.println("Warning and game tones: on");
                    case 8 -> System.out.println("Vibration:on");
                    case 9 -> System.out.println("Screen saver: on");
                }
                break;
            case 6:
                System.out.println("""
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
                         4-> Restore factory settings""");
                userInput= scanner.nextInt();
                switch (userInput){
                    case 1 -> {
                        System.out.println("""                          
                                 1-> Automatic redial
                                 2-> Speed dialing
                                 3-> Call waiting options
                                 4-> Own number sending
                                 5-> Phone line in use
                                 6-> Automatic answer""");
                        userInput=scanner.nextInt();
                        switch (userInput){
                            case 1-> System.out.println("Automatic redial: on");
                            case 2-> System.out.println("Speed dialing: on");
                            case 3-> System.out.println("Call waiting options:");
                            case 4-> System.out.println("Own number sending: on");
                            case 5-> System.out.println("Phone line in use: on");
                            case 6-> System.out.println("Automatic answer: off");
                        }
                    }
                    case 2 -> {
                        System.out.println("""                            
                                 1-> Language
                                 2-> Cell info display
                                 3-> Welcome note
                                 4-> Network selection
                                 5-> Lights
                                 6-> Confirm SIM service actions""");
                        userInput=scanner.nextInt();
                        switch (userInput){
                            case 1-> System.out.println("Language: English");
                            case 2-> System.out.println("Call info display: on");
                            case 3-> System.out.println("Welcome note: Hello");
                            case 4-> System.out.println("Network selection: automatic");
                            case 5-> System.out.println("Lights: on");
                            case 6-> System.out.println("Confirm SIM service actions: on");
                        }
                    }
                    case 3 -> {
                        System.out.println("""                             
                                 1-> PIN code request
                                 2-> Call barring service
                                 3-> Fixed dialing
                                 4-> Closed user group
                                 5-> Phone security
                                 6-> Change access codes""");
                        userInput=scanner.nextInt();
                        switch (userInput){
                            case 1-> System.out.println("PIN code request: off");
                            case 2-> System.out.println("Call barring service: on");
                            case 3-> System.out.println("Fixed dialing: off");
                            case 4-> System.out.println("Closed user group: off");
                            case 5-> System.out.println("Phone security: pin code");
                            case 6-> System.out.println("Change access codes: off");
                        }
                    }
                    case 4-> System.out.println("Factory settings restored");
                }
                break;
            case 7:
                System.out.println(NokiaThirtyThreeTen.callDivert());
                break;
            case 8:
                System.out.println(NokiaThirtyThreeTen.games());
                break;
            case 9:
                System.out.println(NokiaThirtyThreeTen.calculator());
                break;
            case 10:
                System.out.println(NokiaThirtyThreeTen.reminders());
                break;
            case 11:
                System.out.println("""                
                1-> Alarm clock
                2-> Clock settings
                3-> Date setting
                4-> Stopwatch
                5-> Countdown timer          
                6-> Auto update of date and time""");
                userInput=scanner.nextInt();
                switch (userInput){
                    case 1-> System.out.println("set Alarm");
                    case 2-> System.out.println("current time: 12:08:16");
                    case 3-> System.out.println("current date: 12-08-2021");
                    case 4-> System.out.println("09:00:00");
                    case 5-> System.out.println("08:00:59");
                    case 6-> System.out.println("Auto update of date and time:on");
                }
                break;
            case 12:
                System.out.println(NokiaThirtyThreeTen.profiles());
                break;
            case 13:
                System.out.println(NokiaThirtyThreeTen.simServices());
                break;
        }

    }
}
