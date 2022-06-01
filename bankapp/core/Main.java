package bankapp.core;

public class Main {

    public static void main(String[] args) {

        BankAccount one = new BankAccount("John", 200.50F);
        one.deposit(-2.55F);

        System.out.printf("The account holder's name is %s.\n", one.accountHolder);
        System.out.printf("The account balance is $%.2f.\n", one.accountBal);
    }
    
}
