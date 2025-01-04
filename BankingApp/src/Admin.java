public class Admin extends User {
    public Admin(String userName, String password) {
        super(userName, password);
    }



    
    public void addCustomer(Customer customer) {
        System.out.println("Adding customer: " + customer.getUserName());
    }

    public void removeCustomer(Customer customer) {
        System.out.println("Removing customer: " + customer.getUserName());
    }

    public void printBankInfo() {
        System.out.println("Printing bank information...");
    }
}
