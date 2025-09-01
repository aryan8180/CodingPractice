public class Practice {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.deposit(500);
        b1.withdraw(200);
        b1.displayAccountDetails();

        BankAccount b2 = new BankAccount();
        b2.withdraw(500);
        b2.displayAccountDetails();

    }

}

class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Invalid Amount Entered!");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && balance>=amount){
            balance -= amount;
        }else{
            System.out.println("Curret balance is less! You cannot withdraw");
        }
    }

    public double getBalance(){
        return balance;
    }

    void displayAccountDetails(){
        System.out.println("Account Number: " + accountNumber + " | Account Holder Name: " + accountHolderName + " | Balance: " + balance + "." );
    }
}
