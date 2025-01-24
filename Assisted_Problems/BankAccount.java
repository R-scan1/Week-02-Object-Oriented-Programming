import java.util.ArrayList;
class Bank {
    private String name;
    private ArrayList<Customer> customers;


    Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }


    public void openAccount(Customer customer, double initialBalance) {
        Account newAccount = new Account(this, initialBalance);
        customer.addAccount(newAccount);  
        customers.add(customer);  
    }


    public String getName() {
        return name;
    }
}


class Customer {
    private String name;
    private ArrayList<Account> accounts;  


    Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }


    public void addAccount(Account account) {
        accounts.add(account);
    }


    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            System.out.println("Balance: " + account.getBalance() + " in Bank: " + account.getBank().getName());
        }
    }
}


class Account {
    private Bank bank;  
    private double balance;  


    Account(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }


    public Bank getBank() {
        return bank;
    }


    public double getBalance() {
        return balance;
    }
}


public class BankAccount {
    public static void main(String[] args) {
        Bank bank1 = new Bank("State Bank Of India");
        Bank bank2 = new Bank("Union Bank");


        Customer customer1 = new Customer("Raj");
        Customer customer2 = new Customer("Manish");


        bank1.openAccount(customer1, 4000);
        bank1.openAccount(customer2, 8000);
        bank2.openAccount(customer1, 3000);


        customer1.viewBalance();
        customer2.viewBalance();
    }
}
