// package src.test.java.Stage2;
// import org.testng.Assert;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.AfterClass;
// import org.testng.annotations.DataProvider;
// import org.testng.annotations.Test;

// public class UserServiceTest {

//     private UserService userService;

//     @BeforeClass
//     public void setup() {
//         userService = new UserService();
//     }

//     @Test
//     public void testRegisterUser() {
//         boolean result = userService.register("john_doe", "password123");
//         Assert.assertTrue(result);
//     }

//     @Test(dataProvider = "loginData")
//     public void testLoginUser(String username, String password) {
//         boolean loggedIn = userService.login(username, password);
//         Assert.assertEquals(loggedIn, true);
//     }

//     @DataProvider(name = "loginData")
//     public Object[][] loginDataProvider() {
//         return new Object[][] {
//             {"john_doe", "password123"},
//             {"jane_doe", "123456"}
//         };
//     }

//     @Test(expectedExceptions = NullPointerException.class)
//     public void testNullLogin() {
//         userService.login(null, null);
//     }

//     @AfterClass
//     public void tearDown() {
//         userService = null;
//     }
// }
