package bankapp.core;

public class FixedDepositAccount extends BankAccount{

    private float interest = 0;
    private int duration = 0;

    public FixedDepositAccount(String name, float initVal) {
        // call the parent's class default constructor;
        // super() can only be used in constructor and must be used in the first line in a constructor.
        super(name, initVal); 
    }
    public FixedDepositAccount(String name, float initVal, float interest) {
        super(name, initVal); // ..
        this.interest = interest;
    }
    public FixedDepositAccount(String name, float initVal, float interest, int duration) {
        this(name, initVal, interest); // .
        this.duration = duration; 
    }

    public float getBalance() {
        
    }
}
