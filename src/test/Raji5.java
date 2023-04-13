import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Raji5 {
    public String basicUrl = "http://172.25.25.5:8090/httpclient.html";
    String drivepath = "C:\\Users\\Pavan.Kopparapu\\Downloads\\chromedriver_win32";
    public WebDriver driver;
    @Test
    public void test(){
        System.setProperty("Webdriver.chrome.driver",drivepath);
        driver =  new ChromeDriver();
        driver.get("C:\\Users\\Pavan.Kopparapu\\Downloads\\chromedriver_win32");
        String Url = driver.getCurrentUrl();
        System.out.println("C:\\Users\\Pavan.Kopparapu\\Downloads\\chromedriver_win32");
        String titles = driver.getTitle();
        System.out.println("'C:\\Users\\Pavan.Kopparapu\\Downloads\\chromedriver_win32");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTest(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);

        }
        System.out.println("After Test");
    }
}
