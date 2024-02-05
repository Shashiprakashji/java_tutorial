package Classes;

public class Main {
    public static void main(String[] args) {
        BankAccount ramAccount=new BankAccount();
        ramAccount.setAccountNumber("12345");
        ramAccount.setAccountBalance(150000.34);
        ramAccount.setEmail("abc@gmail.com");
        ramAccount.setPhoneNumber("9257532571");
        ramAccount.setCustomerName("Ram Kumar");

        ramAccount.withdrawFunds(100000.0);
        ramAccount.depositeFunds(20000.0);

        ramAccount.withdrawFunds(1234.01);

        ramAccount.withdrawFunds(10750.0);
        ramAccount.depositeFunds(2229900.0);

        ramAccount.withdrawFunds(1009280.0);
        ramAccount.depositeFunds(200.0);

    }
}
