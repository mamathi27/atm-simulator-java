import java.util.ArrayList;

public class BankAccount {
    long accountNo;
    String accountName;
    int pin;
    double balance;
    ArrayList<String> transactions = new ArrayList<>();
    BankAccount(long accountNo,int pin,String accountName,double balance){
        this.accountName = accountName;
        this.pin = pin;
        this.balance = balance;
        this.accountNo = accountNo;
    }
    void deposit(double amount){
        balance+=amount;
        transactions.add("deposited:"+amount);

    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            transactions.add("withdrawn:"+amount);
        }
        else System.out.println("Insufficient balance");
    }
    void checkBalance(){
        System.out.println("balance:"+balance);
    }
    void showTransactions(){
        for(String t: transactions){
            System.out.println(t);
        }
    }
}
