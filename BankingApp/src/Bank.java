public class Bank {
    private String bankName ;
    private Customer[] customers ; // Customer her öğenin türü Customer sınıfından türetilmiş nesneler var 
    // customers dizinin adı 
private int customerCount ; // müşteri sayısı 
// dışşardan sadece bankname alıcaz diğerleri baştan belirtildiği şekişlde 
public Bank (String bankName ) {
 /// banka ismi dışında diğer öğelerine varsayılan değerlerle başlıyor  ztn 
this.bankName = bankName ;
this.customers = new Customer [10] ;
this.customerCount = 0 ;

}

public void addCustomer (Customer customer ) { // customer türünde bir nesne gelecek fonksyon içine 
if(customerCount < customers.length) {
        customers [customerCount++] = customer ;
    } else {
        System.out.println("No space available to add a new customer!");
    }

    }
public void removeCustomer (Customer customer){

}

public void printCustomerInfo() {
    for (int i = 0; i < customerCount; i++) {
        System.out.println("Customer Name: " + customers[i].getUserName());
        customers[i].viewBalance();
    }
}

/*  customer ve customer count değişkenleri sınıfın özellikleri 
 * bu özellikler sınıf içinde her yerde kullanılabiilri 
 * parametre yazsan sadece bir müşteri için çalışırdı 
 * bank.printCustomerInfo(customer1);
*/
public void printBankInfo() {
    System.out.println("Bank Name: " + bankName);
}

}






