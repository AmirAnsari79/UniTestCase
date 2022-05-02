package Exercise_Test4;

import org.junit.Assert;
import org.junit.Test;

public class test_account {
    Account account = new Account("account", 20);

    @Test
    public void deposit_test() {
        int exp = 40;
        int amount = 20;
        Assert.assertEquals(exp, account.deposit(amount));
    }

    @Test
    public void withdraw_test_pass() {
        int exp = 10;
        int amount = 10;
        Assert.assertEquals(exp, account.withdraw(amount));

    }

    @Test
    public void withdraw_test_fail() {
        int exp = 0;
        int amount = 40;
        Assert.assertEquals(exp, account.withdraw(amount));
    }

    @Test
    public void transfer_test_pass() {
        Account ac = new Account("seccond ", 20);
        double amount = 10;
        Assert.assertEquals(true, ac.transfer(ac,amount));

    }
    @Test
    public void transfer_test_fail() {
        Account ac = new Account("seccond", 20);
        double amount = 30;
        Assert.assertEquals(false, ac.transfer(ac,amount));

    }
}
