// import java.util.ArrayList;
import java.util.HashSet;
public class Bank {
    HashSet<Account> accounts=new HashSet<Account>();
    void createAccount(Account account){
        accounts.add(account);
        System.out.println("Account created successfully");
    }
    
    public Account findAccount1(long accountNumber) {

        for (Account acc : accounts) {

            if (acc.getAccountNumber() == accountNumber) {
                acc.displayDetails();
                return acc;
            }           
        }
        System.out.println("Invalid Account Number");
        return null;
    }
    public void deleteAccount(long accountNumber){
        
    }
    public Account findAccount(long accountNumber) {

        for (Account acc : accounts) {

            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }           
        }
        System.out.println("Invalid Account Number");
        return null;
    }
    public void depositMoney(long accountNumber,double amount){
        Account acc=findAccount(accountNumber);
        if (acc!=null) {
            acc.deposit(amount);
        }
        else{
            System.out.println("Account is not found");
        }
    }
    public void withdrawMoney(long accountNumber,double amount){
        Account acc=findAccount(accountNumber);
        if (acc!=null) {
            acc.withdraw(amount);

        }
        else{
            System.out.println("Account is not found");
        }
    }
    public void transferMoney(){
        
    }
    
    void showAllAccount(){

        System.out.println("----All Accounts----");
        for (Account acc:accounts){
            acc.displayDetails();
            System.out.println("--------------------");
        }
    }

}
