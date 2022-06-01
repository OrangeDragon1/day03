package bankapp.core; 

public class BankAccount {
    // properties or members
    String accountHolder;
    String accountNum;
    float accountBal;
    String[] transactions;
    Boolean accountClosed = true;
    Long createdSince;
    Long closedSince;
    Long currentTime;

    // default constructors
    // public BankAccount () {

    }
    // constructors
    public BankAccount(String name) {
        System.out.println("Creating bank account...\n");
        this.accountHolder = name;
        this.accountBal = 0F;
    }
    public BankAccount(String name, float initVal) {
        System.out.println("Creating bank account...\n");
        this.accountHolder = name;
        this.accountBal = initVal;
    }

    // behaviour or methods
    // deposit
    public void deposit(float amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        } else {
            accountBal += amount;
            System.out.printf("Deposited $%.2f.\n", amount);
        }
    }

    // withdraw
    public void withdraw(float amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        } else {
            accountBal -= amount;
            System.out.printf("Withdrawn $%.2f.\n", amount);
        }
    }   
}
