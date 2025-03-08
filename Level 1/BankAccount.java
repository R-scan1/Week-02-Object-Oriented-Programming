public class BankAccount{
    private static String bankName="Axis Bank";
    private String accountHolderName;
    private final int accountNumber;
    private static int count=0;


    BankAccount(String accountHolderName, int accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        count++;
    }

    public static void getTotalAccounts(){
          System.out.println("Total number of accounts "+count);
          System.out.println();
    }
    
    public void displayDetails(){
        if(this instanceof BankAccount){
        System.out.println("Bank name is "+bankName);
        System.out.println("Account holder name is "+accountHolderName);
        System.out.println("Account number "+accountNumber);
        System.out.println();
        }
        else{
            System.out.println("Account not found!!!");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("Rishi", 12050);
        BankAccount bankAccount2=new BankAccount("Hori",12051);

        getTotalAccounts();
        bankAccount.displayDetails();
        bankAccount2.displayDetails();

    }

}