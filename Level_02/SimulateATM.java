class BankAccount{
    String accountHolder;
    int accountNumber;
    double balance;  

      BankAccount(String accountHolder,int accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
      }

      void deposit(double addMoney){
         balance+=addMoney;
      }

      void withdraw(double withdraw){
        if(balance>withdraw){
           balance-=withdraw;
        }else{
        System.out.println("Insufficient Balance!");
        }
      }

      void displayBalance(){
        System.out.println("Balance "+balance);
      }

}

public class SimulateATM {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("Rahul Singh", 10002930, 100000);
        bankAccount.displayBalance();
        System.out.println("After adding 10000: ");
        bankAccount.deposit(10000);
        bankAccount.displayBalance();
        System.out.println("After withdrawing 2000: ");
        bankAccount.withdraw(2000);
        bankAccount.displayBalance();
    }
}
