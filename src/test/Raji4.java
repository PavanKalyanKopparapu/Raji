import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Raji4 {
    public String basicUrl = "https://zingnext.zinghr.com/portal/tna";
    String drivepath = "C://Users//Pavan.Kopparapu//Downloads//chromedriver_win32//chromedriver.exe";
    public WebDriver driver;
    @Test
    public void test(){
        System.setProperty("Webdriver.chrome.driver.",drivepath);
        driver = new ChromeDriver();
        driver.get("https://zingnext.zinghr.com/portal/tna");
        String Url = driver.getCurrentUrl();
        System.out.println("https://zingnext.zinghr.com/portal/tna");
        String titles = driver.getTitle();
        System.out.println("https://zingnext.zinghr.com/portal/tna");

    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before test");
    }
    @AfterTest
    public void afterTest(){
        try{
            Thread.sleep(1000);

        }catch (InterruptedException e){
            throw new RuntimeException(e);

        }
        System.out.println("After test");

    }
}
