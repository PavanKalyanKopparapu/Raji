import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Raji2 {
    public String baseUrl = "https://leetcode.com/accounts/login/";
    String driverPath = "C://Users//Pavan.Kopparapu//Downloads//chromedriver_win32//chromedriver.exe";
    public WebDriver driver ;
    @Test
    public void test() {
// set the system property for Chrome driver
        System.setProperty("webdriver.chrome.driver", driverPath);
// Create driver object for CHROME browser
        driver = new ChromeDriver();
        driver.get("https://leetcode.com/accounts/login/");
// get the current URL of the page
        String URL= driver.getCurrentUrl();
        System.out.print("https://leetcode.com/accounts/login/");
//get the title of the page
        String titles = driver.getTitle();
        System.out.println("https://leetcode.com/accounts/login/");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("before test");
    }
    @AfterTest
    public void afterTest()  {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("after Test");

    }
}
