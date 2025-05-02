package src.test.java.Stage4;
import org.testng.annotations.Test;

public class GroupUpTest {

    @Test(groups = {"smoke"})
    public void testUserLogin() {
        // Simulate login
    }

    @Test(groups = {"regression"})
    public void testUserProfileUpdate() {
        // Simulate profile update
    }

    @Test(groups = {"negative"})
    public void testInvalidUserLogin() {
        // Simulate failed login
    }
}
