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

        WebElement element1 = browser.findElement(By.cssSelector(".navbar-brand.logo"));
        element1.click();

        WebElement element2 = browser.findElement(By.cssSelector(".btn"));
        element2.click();

        WebElement element3 = browser.findElement(By.xpath("//*[@id='login-form']/div/input[1]"));
        element3.click();

        WebElement element4 = browser.findElement(By.xpath("//*[@id=\"login-form\"]/div/input[2]"));
        element4.click();

        WebElement element5 = browser.findElement(By.linkText("Sign up"));
        element5.click();

        WebElement element6 = browser.findElement(By.linkText("Log in"));
        element6.click();

        WebElement element7 = browser.findElement(By.cssSelector(".btn.btn-primary"));
        element7.click();

        WebElement element8 = browser.findElement(By.cssSelector(".form-control"));
        element8.click();

        browser.get("https://dev.integrivideo.com/demo/5e5a6a8baa6a522b44063e6b");
        browser.manage().window().maximize();
        WebElement element9 = browser.findElement(By.xpath("//*[text()='Invite users to chat']"));
        element9.click();

        WebElement element10 = browser.findElement(By.cssSelector("[target=_blank]"));
        element10.click();

        WebElement element11 = browser.findElement(By.cssSelector(".component-code"));
        element11.click();

        WebElement element12 = browser.findElement(By.cssSelector(".iv-icon.iv-icon-paper-plane"));
        element12.click();

        WebElement element13 = browser.findElement(By.cssSelector(".iv-icon.iv-icon-camera"));
        element13.click();

        WebElement element14 = browser.findElement(By.cssSelector(".integri-video.public"));
        element14.click();

        WebElement element15 = browser.findElement(By.cssSelector(".iv-icon.iv-icon-cog"));
        element15.click();

        WebElement element16 = browser.findElement(By.cssSelector(".integri-chat-bottom-text"));
        element16.click();

        WebElement element17 = browser.findElement(By.linkText("For developers"));
        element17.click();

        WebElement element18 = browser.findElement(By.linkText("Terms of use"));
        element18.click();

        WebElement element19 = browser.findElement(By.linkText("Privacy policy"));
        element19.click();

        WebElement element20 = browser.findElement(By.linkText("Blog"));
        element20.click();

        browser.quit();

    }
}
