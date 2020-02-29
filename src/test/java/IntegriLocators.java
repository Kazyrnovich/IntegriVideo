import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IntegriLocators {
    @Test
    public void categoryLocators() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://dev.integrivideo.com/demo/5e5a6a8baa6a522b44063e6b");
        browser.manage().window().maximize();

        WebElement element = browser.findElement(By.cssSelector(".navbar-brand.logo"));
        element.click();
        

        browser.quit();
    }
}
