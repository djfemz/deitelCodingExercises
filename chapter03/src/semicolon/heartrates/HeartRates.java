package semicolon.heartrates;

public class HeartRates {

    private String firstName;
    private String lastName;
    private String birthMonth;
    private int dayOfBirth;
    private int birthYear;
    private int maximumHeartRate;
    private String targetHeartRate;

    public HeartRates(String firstName, String lastName, String birthMonth, int dayOfBirth, int birthYear) {
            this.firstName=firstName;
            this.lastName=lastName;
            this.birthMonth=birthMonth;
            this.dayOfBirth = dayOfBirth;
            this.birthYear=birthYear;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return dayOfBirth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int year) {
        this.birthYear=year;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBirthMonth(String month) {
        this.birthMonth=month;
    }

    public void setBirthDay(int day) {
        this.dayOfBirth=day;
    }

    public int getAge() {
        return 2021-birthYear;
    }

    public void calculateMaximumHeartRate() {
       int age = getAge();
        maximumHeartRate = 220 - age;
    }

    public int getMaximumHeartRate() {
        return maximumHeartRate;
    }

    public void calculateTargetHeartRate() {
        String targetHeartRate = "";
        double lowerLimit = (0.5 * maximumHeartRate);
        double upperLimit = (0.85 * maximumHeartRate);
        this.targetHeartRate=targetHeartRate + lowerLimit + " to" + " " + upperLimit;
    }

    public String getTargetHeartRate() {
        return targetHeartRate;
    }

    public String getDetails() {
        String userDetails="";
        return userDetails + "Name: " + firstName + " " + lastName + "\n" + "DOB: " + dayOfBirth +" "
                + birthMonth + " " + birthYear + "\n" + "Age: " + getAge() + "\n" + "MaxHeartRate: " + maximumHeartRate
                + "\n" + "TargetHeartRate: " + targetHeartRate;
    }
}
