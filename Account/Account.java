package Exercise_Test4;


/**
 * This Account class represents bank accounts that stores money for an owner.
 */
public class Account {

    private double balance;    // invariant: balance >= 0 (should never be negative)
    private String owner;

    public Account(String name, double b) {
        balance = b;
        owner = name;
    }


    /**
     * Deposits 'amount' into the account.
     */
    public int deposit(double amount) {

        return (int) (balance + amount);

    }

    /**
     * Withdraws 'amount' from the account.
     * This only makes sense if amount <= balance.
     */
    public int withdraw(double amount) {

        if (balance > amount) {
            balance = balance - amount;
            return (int) balance;
        }

        return 0;
    }

    /**
     * Returns the balance of the Account
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the owner of the Account.
     */
    public String getOwner() {
        return owner.toString();
    }

    /**
     * Transfers money from this account to the another account.
     */
    public boolean transfer(Account targetAccount, double amount) {

        if (withdraw(amount) != 0) {
            targetAccount.withdraw(amount);
            return true;
        }

        return false;
    }
}

