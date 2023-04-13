import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Raji3 {
    public String baseUrl = "https://portal.zinghr.com/2015/pages/authentication/login.aspx";
    String drivepath = "C:\\Users\\Pavan.Kopparapu\\Downloads\\chromedriver_win32.zip";
    public  WebDriver driver;
    @Test
    public void test(){
        System.setProperty("Webdriver.chrome.driver",drivepath);
        driver = new ChromeDriver();
        driver.get("https://portal.zinghr.com/2015/pages/authentication/login.aspx");
        String URL = driver.getCurrentUrl();
        System.out.println("https://portal.zinghr.com/2015/pages/authentication/login.aspx");
        String titles = driver.getTitle();
        System.out.println("https://portal.zinghr.com/2015/pages/authentication/login.aspx");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before Test");
    }
    @AfterTest
    public void afterTest(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);

        }

        System.out.println("after Test");

    }
}

