import java.util.Scanner;
public class MainPage {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Bank bank=new Bank();
        // Account account=new Account(0, null, 0);
        while (true) {      
        System.out.println("-----------------------");
        System.out.println("| 1. Create Account    |");
        System.out.println("| 2. Search Account    |");
        System.out.println("| 3. Delete Account    |");
        System.out.println("| 4. Withdraw          |");
        System.out.println("| 5. Deposit           |");
        System.out.println("| 6. Transfer Money    |");
        System.out.println("| 7. Show All Accounts |");
        System.out.println("| 8. Exit              |");
        System.out.println("-----------------------");

       System.out.println("Enter your choice");
       int  choice= sc.nextInt();

            switch (choice) {
            case 1:{

                System.out.println("Enter Acount Number: ");
                long accountNumber=sc.nextLong();
                if (accountNumber==bank.findAccount(accountNumber).getAccountNumber()) {
                    System.out.println("Account is already exist");
                }else{

                    System.out.println("Enter Acount Holder: ");
                    sc.nextLine();
                    String accountHolder=sc.nextLine();
                    System.out.println("Enter Initial Amount: ");
                    double balance=sc.nextDouble();
                    Account account=new Account(accountNumber, accountHolder, balance);
                    System.out.println();
                    System.out.println("| 1. CurrentAcount |");
                    System.out.println("| 2. SavingAcount  |");
                    System.out.println();
                    System.out.println("Enter Account Type: ");
                    int ch=sc.nextInt();
                    switch (ch) {
                        case 1:
                            bank.createAccount(account);
                            break;
                        case 2:
                            bank.createAccount(account);
                            break;
                    
                        default:
                            System.out.println("Enter a Valid Choice");
                            break;
                    }
                }
                

                break;
            }
            case 2:{

                System.out.println("Enter Account Number: ");
                long accountNumber=sc.nextLong();
                bank.findAccount1(accountNumber);
                break;
            }
            case 3:
                
                      
                break;


            case 4:{

                System.out.println("Enter Account Number: ");
                long accountNumber=sc.nextLong();
                System.out.println("Enter Deposit Amount: ");
                double amount=sc.nextDouble();
                bank.depositMoney(accountNumber,amount);
                break;
            }
            case 5:{
                
                System.out.println("Enter Account Number: ");
                long accountNumber=sc.nextLong();
                System.out.println("Enter Withdraw Amount: ");
                double amount=sc.nextDouble();
                bank.withdrawMoney(accountNumber,amount);
                break;
            }
            case 6:
                
                break;

            
            case 7:{

                bank.showAllAccount();
                break;
            }
            case 8:
                System.out.println("Exiting....");
                sc.close();
                System.exit(0);
                break;

            default:
                System.out.println("Enter a valid choice");
                break;
            }
        }
        
    }
}
