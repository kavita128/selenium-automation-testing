import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Step 1: Try to dismiss the "Choose your location" popup
        try {
            WebElement dismissPopup = wait.until(
                    ExpectedConditions.elementToBeClickable(By.id("nav-main"))
            );

            // Some popups have "Not now" button or close icon
            WebElement notNowButton = driver.findElement(By.xpath("//button[contains(@data-action-type, 'DISMISS')]"));
            notNowButton.click();
            System.out.println("Popup dismissed.");
        } catch (Exception e) {
            System.out.println("No location popup or already dismissed.");
        }

        // Step 2: Hover over "Account & Lists"
        
            Actions a = new Actions(driver);
            WebElement move = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList")));
            a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
            a.moveToElement(move).contextClick().build().perform();
        
            
            
        
    }
}