public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void viewBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
    }






}

