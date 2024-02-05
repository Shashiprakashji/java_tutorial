package Constructors;

public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer("Shayam",70000.0,"xyz@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer=new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

    }
}
