
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

interface OnlineBanking {
    void payBill(double amount, String billType);
}
class SavingsAccount implements BankAccount, OnlineBanking {
    private double balance;
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void payBill(double amount, String billType) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Paid " + amount + " for " + billType);
        } else {
            System.out.println("Insufficient funds for bill payment!");
        }
    }

    public void checkBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

public class IntefaceMultipleInheritance {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.deposit(1000);
        account.checkBalance();
        account.withdraw(500);
        account.payBill(100, "Electric");
        account.checkBalance();
    }
}
