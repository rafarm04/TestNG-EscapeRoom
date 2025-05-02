// package src.test.java.Stage6;
// import org.testng.Assert;
// import org.testng.annotations.DataProvider;
// import org.testng.annotations.Parameters;
// import org.testng.annotations.Test;

// public class PowerTrioTest {

//     Calculator calculator = new Calculator();

//     @Test(groups = {"math"})
//     public void testIsPositive() {
//         Assert.assertTrue(calculator.isPositive(10));
//         Assert.assertFalse(calculator.isPositive(-5));
//     }

//     @Test(groups = {"math"}, dataProvider = "addData")
//     public void testAdd(int a, int b, int expected) {
//         Assert.assertEquals(calculator.add(a, b), expected);
//     }

//     @DataProvider
//     public Object[][] addData() {
//         return new Object[][] {
//             {2, 3, 5},
//             {10, 0, 10},
//             {-1, -1, -2}
//         };
//     }

//     @Test(groups = {"exceptions"})
//     @Parameters({"a", "b"})
//     public void testDivide(@org.testng.annotations.Optional("4") int a,
//                            @org.testng.annotations.Optional("2") int b) {
//         Assert.assertEquals(calculator.divide(a, b), a / b);
//     }
// }
