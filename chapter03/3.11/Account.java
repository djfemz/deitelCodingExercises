
public class Account {
    private String name;
    private double balance;

    public Account(String name, double depositAmount) {
        this.name = name;
        if (depositAmount>0){
            balance = balance+depositAmount;
        }
    }

    public String getName() {
        return name;

    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amountToDeposit) {
        balance= balance+amountToDeposit;
    }

    public void withdraw(double amountToWithdraw) {
        if (amountToWithdraw<=balance) {
            balance = balance - amountToWithdraw;
        }
    }
}
