import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String [] args) throws InterruptedException {
        //Creating selenium driver object
        System.setProperty("webdriver.chrome.driver","WebDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
//        Thread.sleep(5000);
        driver.quit();
    }
}
