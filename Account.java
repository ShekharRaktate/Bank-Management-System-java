
public class Account {

    private long accountNumber;
    private String accountHolder;
    private double balance;
    // for balanace
    public double getBalance() {
        return balance;
    }
    // for AccountNumber
    public long getAccountNumber(){
        return accountNumber;
    }
    // for AccountHolder
    public String getAccountHolder() {
        return accountHolder;
    }
    //constructor
    public Account(long accountNumber,String accountHolder,double balance){
        
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public void deposit(double amount){
        System.out.println("Current Balance: "+balance);

        System.out.println("Deposit amount: "+amount);
        if (amount >0) {
                balance+=amount;
                System.out.println("New Balance: "+balance);
        }
        else{
            System.out.println("Invalid Deposit amount");
        }
    } 
    public void withdraw(double amount){
        if (amount<=balance && amount >0) {
            System.out.println("Amount successfully withdrawn");
            balance-=amount;
            System.out.println("Current balance: "+balance);
        }
        else if(amount<=0){
            System.out.println("Invalid Amount");
        }
        else{
            System.out.println(" Insufficient Balance ");
        }
    }
    public void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance: "+balance);
    }
    
}
class CurrentAccount extends Account{
    CurrentAccount(long accountNumber,String accountHolder,double balance){
        super(accountNumber, accountHolder, balance);
        
        displayDetails();
    }
}
class SavingAccount extends Account {

    SavingAccount(long accountNumber,String accountHolder,double balance){
        super(accountNumber, accountHolder, balance);
        displayDetails();
    }
}