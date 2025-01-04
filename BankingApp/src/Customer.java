public class Customer extends User {
    private Account account;

    public Customer(String userName, String password, double balance) {
        super(userName, password);
        this.account = new Account("Account" + userName, balance);
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void viewBalance() {
        account.viewBalance();
    }
}
