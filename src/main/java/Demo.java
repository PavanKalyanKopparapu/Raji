import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
    public static void main(String[] args)  {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Pavan.Kopparapu\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");

        // Initialize Gecko Driver using Desired Capabilities Class
        WebDriver driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        }
    }

