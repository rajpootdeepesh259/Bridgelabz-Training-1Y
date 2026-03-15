
class BankAccount {
    
    String accountHolder;
    String accountNumber;
    double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        }
    }
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("John Doe", "123456789", 1000.0);

        account1.displayBalance();

        account1.deposit(500.0);
        account1.displayBalance();

        account1.withdraw(300.0);
        account1.displayBalance();

        account1.withdraw(1500.0);
        account1.displayBalance();
    }
}