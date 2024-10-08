//package Examples;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class PerformDataDriventestingUsingSeleniumwithDB {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\teena\\selenium\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("url");
//		// step 1
//		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1234");
//		// step 2
//		Statement stmt = con.createStatement();
//		// Step 3 : execute the query
//		// exampkle of how we can do login into application by taking values from
//		// database
//		String select_Query = "select username,password from Employee";
////			step 4
//		ResultSet rs = stmt.executeQuery(select_Query);
//
//		while (rs.next()) {
//			String username = rs.getString("username");
//			String password = rs.getString("password");
//			System.out.println(username);
//			System.out.println(password);
//			// inspect the element
////				driver.findElement(By.id("username")).sendKeys(username);
////				driver.findElement(By.id("password")).sendKeys(password);
//			// we'll do verifyu
//			if (driver.getTitle().equals("page title name")) {
//				System.out.println("Testcase is passed");
//			} else {
//				System.out.println("Tesytcase failed");
//			}
//		}
//		// Step 5 : close connection
//		con.close();
//		System.out.println("Program is exited");
//	}
//}
