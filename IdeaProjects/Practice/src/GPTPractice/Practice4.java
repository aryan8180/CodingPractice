package GPTPractice;

public class Practice4 {
    public static void main(String[] args) {

        BankAccount Account1 = new BankAccount();
        Account1.displayDetail();

        BankAccount Account2 = new BankAccount(101, "Alice", 5000); // Parameterized
        Account2.displayDetail();
        Account2.deposit(20000);
        Account2.displayDetail();
        Account2.withdraw(5000);
        Account2.displayDetail();

        BankAccount Account3 = new BankAccount(102, "Bob");
        Account3.displayDetail();

        // ✅ Testing setters & getters
        Account3.setHolderName("Robert");
        System.out.println("Updated Holder Name: " + Account3.getHolderName());
        System.out.println("Balance Check: " + Account3.getBalance());
    }
}

class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    // Default constructor
    BankAccount() {
        accountNumber = 0;
        holderName = "Unknown";
        balance = 0.0;
    }

    // Parameterized constructor
    BankAccount(int aNum, String hName, double bal) {
        this.accountNumber = aNum;
        this.holderName = hName;
        this.balance = bal;
    }

    // Constructor with default balance
    BankAccount(int aNum, String hName) {
        this.accountNumber = aNum;
        this.holderName = hName;
        this.balance = 1000;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter
    public void setHolderName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.holderName = name;
        } else {
            System.out.println("Invalid Name");
        }
    }

    // Deposit
    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw
    void withdraw(double amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
    }

    // Display account details
    void displayDetail() {
        System.out.println("Account Number: " + accountNumber +
                " | Holder Name: " + holderName +
                " | Balance: " + balance);
    }
}
