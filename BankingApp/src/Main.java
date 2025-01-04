public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("BankX");
        Customer customer1 = new Customer("Ahmet", "1234", 1000.0);
        bank.addCustomer(customer1);

        customer1.viewBalance();
        customer1.deposit(500);
        customer1.withdraw(200);
        bank.printCustomerInfo();
    }
}
