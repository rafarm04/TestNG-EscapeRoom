package src.test.java.Stage3;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {

    public boolean isEven(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        return number % 2 == 0;
    }

    @DataProvider(name = "evenNumbersProvider")
    public Object[][] provideNumbers() {
        return new Object[][] {
            {2, true},
            {3, false},
            {4, true},
            {5, false},
            {0, true}
        };
    }

    @Test(dataProvider = "evenNumbersProvider")
    public void testIsEven(int input, boolean expected) {
        Assert.assertEquals(isEven(input), expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    @Parameters({"negativeInput"})
    public void testNegativeNumber(int number) {
        isEven(number);
    }
}
