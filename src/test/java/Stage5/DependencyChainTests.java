package src.test.java.Stage5;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyChainTests {

    boolean loggedIn = false;
    double balance = 0.0;

    @Test
    public void loginTest() {
        System.out.println("Logging in...");
        loggedIn = true;
        Assert.assertTrue(loggedIn);
    }

    @Test(dependsOnMethods = "loginTest")
    public void depositTest() {
        System.out.println("Depositing...");
        balance += 100;
        Assert.assertEquals(balance, 100.0);
    }

    @Test(dependsOnMethods = "depositTest")
    public void withdrawTest() {
        System.out.println("Withdrawing...");
        balance -= 50;
        Assert.assertEquals(balance, 50.0);
    }

    @Test(dependsOnMethods = "withdrawTest", alwaysRun = true)
    public void checkBalanceTest() {
        System.out.println("Checking balance...");
        Assert.assertTrue(balance >= 0);
    }
}
